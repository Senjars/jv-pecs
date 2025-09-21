package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
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
