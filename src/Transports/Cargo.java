package Transports;

import Enumerations.LoadCapacity;
import Exeptions.ImmposiblePassDiagnostic;

import java.util.Objects;

public class Cargo extends Transport {

    private LoadCapacity loadCapacity;

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Cargo(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных недостаточно.");
        } else System.out.println("Грузоподъемность грузовика " + getBrand() + " " + getModel() + " составляет от " + getLoadCapacity().getLow() + " до " +
                getLoadCapacity().getHigh() + " тонн.");
    }

    @Override
    public int diagnostic(int cases) throws ImmposiblePassDiagnostic {
        if (cases >= 0) {
            System.out.println(getBrand() + " " + getModel() +" диагностика не требуется");
        } else System.out.println(getBrand() + " " + getModel() + " требуется пройти диагностику");
        return cases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cargo cargo = (Cargo) o;
        return loadCapacity == cargo.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
}

