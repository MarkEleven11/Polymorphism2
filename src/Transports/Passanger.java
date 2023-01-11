package Transports;

import Enumerations.BodyType;

public class Passanger extends Transport{

    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Passanger(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных недостаточно");
        } else System.out.println("Тип кузова автомобиля " + getBrand() + " " + getModel() + " - " + getBodyType());

    }
}
