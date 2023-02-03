package Transports;

import Drivers.Driver;
import Exeptions.ImmposiblePassDiagnostic;
import MechanicsWorkers.Mechanics;

import java.util.List;
import java.util.Objects;

public abstract class Transport implements Competing {

    private String brand;

    private String model;

    private double engineVolume;

    private List<Mechanics> carMechanics;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public List<Mechanics> getCarMechanics() {
        return carMechanics;
    }

    public void setCarMechanics(List<Mechanics> carMechanics) {
        this.carMechanics = carMechanics;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Марка " + getBrand() + ". Модель " + getModel() + ". Объем двигателя " + getEngineVolume() + ".";
    }

    public void movement() {
        System.out.println(getBrand() + " " + getModel() + " - вставить ключ, снять ручник, завести двигатель.");
    }

    public void stop() {
        System.out.println(getBrand() + " " + getModel() + " - остановить автомобиль, заглушить двигатель, поставить на ручник.");
    }
    /// Имплементируем методы
    @Override
    public int pitStop(int numberOfLap) {
        if (numberOfLap <= 30 && numberOfLap % 10 != 0) {
            System.out.println(getBrand() + " " + getModel() + " продолжает движение");
        } else if (numberOfLap == 31) {
            System.out.println(getBrand() + " " + getModel() + " финишировал");
        } else if (numberOfLap > 31) {
            System.out.println("Для " + getBrand() + " " + getModel() + " гонка давно закончилась.");
        } else {
            System.out.println(getBrand() + " " + getModel() + " выходит на питстоп");
        }
        return numberOfLap;
    }

    @Override
    public double bestTime(double time) {
        System.out.println(getBrand() + " " + getModel() + " - лучшее время " + time + " минут.");
        return 0;
    }

    @Override
    public int maxSpeed(int speed) {
        System.out.println(getBrand() + " " + getModel() + " - максимальная скорость " + speed + " километров в час.");
        return 0;
    }

    public abstract void printType();

    public abstract int diagnostic(int cases) throws ImmposiblePassDiagnostic;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && carMechanics.equals(transport.carMechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, carMechanics);
    }
}
