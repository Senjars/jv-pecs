package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck>{

    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("Scania", "red", 20532.2),
                new Truck("Man", "Black", 199999.2));
    }
}
