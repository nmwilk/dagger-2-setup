package nmw.dagger2setup.model;

import javax.inject.Inject;

/**
 * Created by neil.wilkinson on 06/07/15.
 */
public class Engine {
    private final float capacity;
    private final Fuel fuel;

    @Inject
    public Engine() {
        this(1.9f, Fuel.DIESEL);
    }

    public Engine(final float capacity, final Fuel fuel) {
        this.capacity = capacity;
        this.fuel = fuel;
    }

    public float getCapacity() {
        return capacity;
    }

    @Override public String toString() {
        return Float.toString(capacity) + fuel.suffix();
    }
}
