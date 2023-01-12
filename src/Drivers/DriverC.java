package Drivers;

import Exeptions.NoAccesExeption;

public class DriverC extends Driver {

    private String categoryC;

    public String getCategoryC() {
        return categoryC;
    }

    public DriverC(String sFM, boolean license, int experience, String categoryC) throws NoAccesExeption {
        super(sFM, license, experience);
        if (categoryC == null || categoryC.isEmpty() || categoryC.isBlank()) {
            throw new NoAccesExeption("Отсутсвует водительское удостоверение категории " + getCategoryC());
        } else this.categoryC = categoryC;
    }

    public String toString() {
        return "Водитель " + getsFM() + " с наличием прав категории " + getCategoryC();
    }
}
