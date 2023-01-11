package Drivers;

public class DriverD extends Driver{

    private String categoryD;

    public DriverD(String sFM, boolean license, int experience, String categoryD) {
        super(sFM, license, experience);
        this.categoryD = "D";
    }

    public String getCategoryD() {
        return categoryD;
    }

    public String toString() {
        return "Водитель " + getsFM() + " с наличием прав категории " + getCategoryD();
    }
}
