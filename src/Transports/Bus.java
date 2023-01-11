package Transports;

import Enumerations.Capacity;

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
        public int diagnostic(int cases){
            if (cases >= 0) {
                System.out.println("Автобусам диагностика не требуется");
            } else System.out.println("Автобусам диагностика не требуется");
            return cases;
        }

}

