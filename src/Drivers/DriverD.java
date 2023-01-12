package Drivers;

import Exeptions.NoAccesExeption;

public class DriverD extends Driver{

    private String categoryD;

    public DriverD(String sFM, boolean license, int experience, String categoryD) throws NoAccesExeption {
        super(sFM, license, experience);
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
}
