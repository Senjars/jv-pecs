package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("Gregory", "Brown", 22),
                new Truck("James", "pink", 21),
                new Truck("Harry", "yellow", 19));
    }
}
