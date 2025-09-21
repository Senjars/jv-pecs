package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int tireSize;

    public Truck(String name, String color, int tireSize) {
    }

    public int getTireSize(int tireSize) {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
