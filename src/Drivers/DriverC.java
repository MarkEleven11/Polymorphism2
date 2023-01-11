package Drivers;

public class DriverC extends Driver {

    private String categoryC;

    public String getCategoryC() {
        return categoryC;
    }

    public DriverC(String sFM, boolean license, int experience, String categoryC) {
        super(sFM, license, experience);
        this.categoryC = "C";
    }
    public String toString() {
        return "Водитель " + getsFM() + " с наличием прав категории " + getCategoryC();
    }
}
