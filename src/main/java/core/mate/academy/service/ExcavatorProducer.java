package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("Jessica", "brown", 200),
                new Excavator("Moose", "green", 123),
                new Excavator("Ronald", "red", 199));
    }
}
