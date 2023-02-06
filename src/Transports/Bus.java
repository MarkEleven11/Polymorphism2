package Transports;

import Enumerations.Capacity;
import Exeptions.ImmposiblePassDiagnostic;

import java.util.Objects;

public class Bus extends Transport {

    private Capacity capacity;

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных недостаточно");
        } else
            System.out.println("Вместимость автобуса " + getBrand() + " " + getModel() + " составляет от " + capacity.getSeatsNumberMin() + " до " +
                    capacity.getGetSeatsNumberMax() + " человек.");
    }

    @Override
        public int diagnostic(int cases) throws ImmposiblePassDiagnostic {
            throw new ImmposiblePassDiagnostic("Автобусы не могут проходить диагностику", this);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return capacity == bus.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}

