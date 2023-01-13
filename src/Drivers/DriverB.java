package Drivers;

import Exeptions.NoAccesExeption;
import Transports.Passanger;

public class DriverB extends Driver <Passanger> {

    private String categoryB;

    public DriverB(String sFM, boolean license, int experience, Passanger passanger, String categoryB) throws NoAccesExeption {
        super(sFM, license, experience, passanger);
        if (categoryB == null || categoryB.isEmpty() || categoryB.isBlank()) {
            throw new NoAccesExeption("Отсутсвует водительское удостоверение категории " + getCategoryB());
        } else this.categoryB = categoryB;
    }
    public String getCategoryB() {
        return categoryB;
    }


    @Override
    public String toString() {
        return "Водитель " + getsFM() + " с наличием прав категории " + getCategoryB();
    }
}