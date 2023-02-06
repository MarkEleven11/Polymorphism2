package Drivers;

import Exeptions.NoAccesExeption;
import Transports.Cargo;

import java.util.Objects;

public class DriverC extends Driver <Cargo> {

    private String categoryC;

    public String getCategoryC() {
        return categoryC;
    }

    public DriverC(String sFM, boolean license, int experience, Cargo cargo, String categoryC) throws NoAccesExeption {
        super(sFM, license, experience, cargo);
        if (categoryC == null || categoryC.isEmpty() || categoryC.isBlank()) {
            throw new NoAccesExeption("Отсутсвует водительское удостоверение категории " + getCategoryC());
        } else this.categoryC = categoryC;
    }

    public String toString() {
        return "Водитель " + getsFM() + " с наличием прав категории " + getCategoryC();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverC driverC = (DriverC) o;
        return Objects.equals(categoryC, driverC.categoryC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), categoryC);
    }
}
