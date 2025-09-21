package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int hp;
    public Excavator(String name, String color, int hp) {
    }

    public int getHp(int hp) {
        return  hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
