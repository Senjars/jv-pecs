package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double price;

    public Bulldozer(String name, String color, double price) {
    }

    public double getPrice(double price) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
