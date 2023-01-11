package Transports;

import Enumerations.LoadCapacity;

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

}

