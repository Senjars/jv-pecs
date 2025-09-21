package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.BulldozerProducer;
import core.mate.academy.service.ExcavatorProducer;
import core.mate.academy.service.TruckProducer;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    @SuppressWarnings("unchecked")
    public List<T> getAll(Class<T> type) {
        if (type.equals(Truck.class)) {
            return (List<T>) new TruckProducer().get();
        } else if (type.equals(Bulldozer.class)) {
            return (List<T>) new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            return (List<T>) new ExcavatorProducer().get();
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
