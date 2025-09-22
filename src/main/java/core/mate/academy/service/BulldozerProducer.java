package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("Bull", "red", 200.000),
                new Bulldozer("Ginny", "black", 199.403),
                new Bulldozer("Gertrude", "blue", 980.21));
    }
}
