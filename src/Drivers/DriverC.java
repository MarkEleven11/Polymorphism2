package Drivers;

import Exeptions.NoAccesExeption;
import Transports.Cargo;

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
}
