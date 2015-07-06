package nmw.dagger2setup.model;

/**
 * Created by neil.wilkinson on 06/07/15.
 */
public class Vehicle {
    private final Brand brand;
    private final Model model;
    private final Engine engine;

    public Vehicle(final Brand brand, final Model model, final Engine engine) {

        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    @Override public String toString() {
        return brand.getName() + " " + model.getName() + " " + engine.toString();
    }
}
