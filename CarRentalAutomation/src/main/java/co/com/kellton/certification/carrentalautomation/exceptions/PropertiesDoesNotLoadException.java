package co.com.kellton.certification.carrentalautomation.exceptions;

public class PropertiesDoesNotLoadException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public PropertiesDoesNotLoadException(Exception e) {
        super(e);
    }
}
