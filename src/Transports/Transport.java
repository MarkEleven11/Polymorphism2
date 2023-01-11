package Transports;

public class Transport {

    private String brand;

    private String model;

    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
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
}
