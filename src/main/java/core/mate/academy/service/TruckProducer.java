package core.mate.academy.service;

import core.mate.academy.model.Truck;

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
