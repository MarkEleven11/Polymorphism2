package Transports;

import Enumerations.BodyType;
import Exeptions.ImmposiblePassDiagnostic;

public class Passanger extends Transport<T> {

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

    @Override
    public int diagnostic(int cases) throws ImmposiblePassDiagnostic {
        if (cases >= 0) {
            System.out.println(getBrand() + " " + getModel() +" диагностика не требуется");
        } else System.out.println(getBrand() + " " + getModel() + " требуется пройти диагностику");
        return cases;
    }
}
