package Drivers;

public class DriverB extends Driver {

    private String categoryB;


    public String getCategoryB() {
        return categoryB;
    }

    public DriverB(String sFM, boolean license, int experience, String categoryB) {
        super(sFM, license, experience);
        this.categoryB = "B";
    }

    @Override
    public String toString() {
        return "Водитель " + getsFM() + " с наличием прав категории " + getCategoryB();
    }
}