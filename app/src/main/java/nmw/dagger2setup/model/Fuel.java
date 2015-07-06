package nmw.dagger2setup.model;

/**
 * Created by neil.wilkinson on 06/07/15.
 */
public enum Fuel {
    DIESEL("d"),
    PETROL("i"),
    ELECTRICITY("e");

    private final String suffix;

    Fuel(final String suffix) {
        this.suffix = suffix;
    }

    public String suffix() {
        return suffix;
    }
}
