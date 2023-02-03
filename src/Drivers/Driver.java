package Drivers;

import Transports.Transport;

import java.util.Objects;

public class Driver <T extends Transport> {
    private String sFM;

    private boolean license;

    private int experience;

    private T machine;



    public Driver(String sFM, boolean license, int experience, T machine) {
        this.sFM = sFM;
        this.license = license;
        this.experience = experience;
        this.machine = machine;
    }

    public String getsFM() {
        return sFM;
    }

    public boolean isLicense() {
        return license;
    }

    public int getExperience() {
        return experience;
    }

    public T getMachine() {
        return machine;
    }

    public void movement() {
        System.out.println(getsFM() + " - вставляет ключ, снимает ручник, заводит двигатель.");
    }

    public void stop() {
        System.out.println(getsFM() + " - остановливает автомобиль, глушит двигатель, ставит на ручник.");
    }

    public void refuel() {
        System.out.println(getsFM() +  " - останавливает автомобиль, засовывает пистолет, оплачивает, вытаскивает пистолет, уезжает.");
    }

    public void toRace() {
        System.out.println("Водитель " + getsFM() + " управляет автомобилем " + getMachine() + " и будет учавствовать в заезде.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return license == driver.license && experience == driver.experience && Objects.equals(sFM, driver.sFM) && Objects.equals(machine, driver.machine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sFM, license, experience, machine);
    }
}
