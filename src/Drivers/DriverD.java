package Drivers;

import Exeptions.NoAccesExeption;
import Transports.Bus;

import java.util.Objects;

public class DriverD extends Driver <Bus> {

    private String categoryD;

    public DriverD(String sFM, boolean license, int experience, Bus bus, String categoryD) throws NoAccesExeption {
        super(sFM, license, experience, bus);
        if (categoryD == null || categoryD.isEmpty() || categoryD.isBlank()) {
            throw new NoAccesExeption("Отсутсвует водительское удостоверение категории " + getCategoryD());
        } else this.categoryD = categoryD;
    }

    public String getCategoryD() {
        return categoryD;
    }

    public String toString() {
        return "Водитель " + getsFM() + " с наличием прав категории " + getCategoryD();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverD driverD = (DriverD) o;
        return Objects.equals(categoryD, driverD.categoryD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), categoryD);
    }
}
