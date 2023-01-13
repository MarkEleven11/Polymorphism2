package Drivers;

import Exeptions.NoAccesExeption;
import Transports.Bus;

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
}
