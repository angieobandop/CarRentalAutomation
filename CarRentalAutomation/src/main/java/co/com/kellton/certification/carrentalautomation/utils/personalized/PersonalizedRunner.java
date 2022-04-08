package co.com.kellton.certification.carrentalautomation.utils.personalized;


import co.com.ultragroup.certification.destinojettravel.exceptions.PropertiesDoesNotLoadException;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonalizedRunner extends Runner {


    private Class<CucumberWithSerenity> classValue;
    private CucumberWithSerenity cucumberWithSerenity;

    public PersonalizedRunner(Class<CucumberWithSerenity> classValue) {
        this.classValue = classValue;
        try {
            this.cucumberWithSerenity = new CucumberWithSerenity(classValue);
        } catch (InitializationError | IOException e) {
            throw new PropertiesDoesNotLoadException(e);
        }
    }

    @Override
    public Description getDescription() {
        return cucumberWithSerenity.getDescription();
    }

    private void runAnnotatedMethods(Class<?> annotation) {
        if (!annotation.isAnnotation()) {
            return;
        }
        Method[] methods = this.classValue.getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation item : annotations) {
                if (item.annotationType().equals(annotation)) {
                    try {
                        method.invoke(null);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        throw new PropertiesDoesNotLoadException(e);
                    }
                    break;
                }
            }
        }
    }

    @Override
    public void run(RunNotifier notifier) {
        try {
            runAnnotatedMethods(BeforeSuite.class);
            cucumberWithSerenity = new CucumberWithSerenity(classValue);
        } catch (Exception e) {
            throw new PropertiesDoesNotLoadException(e);
        }
        cucumberWithSerenity.run(notifier);
    }
}