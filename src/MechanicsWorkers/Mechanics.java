package MechanicsWorkers;

import Drivers.Driver;
import Transports.Passanger;

public class Mechanics <M extends Driver> {
    private String nameSurname;
    private String company;
    private M vechicle;

    public Mechanics(String nameSurname, String company) {
        this.nameSurname = nameSurname;
        this.company = company;

    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public M getVechicle() {
        return vechicle;
    }

    public void setVechicle(M vechicle) {
        this.vechicle = vechicle;
    }


    public int serviceAndRepair(int distance) {
        if (distance % 500 == 0) {
            System.out.println("Настало время провести ТО");
        } else if (distance > distance % 500) {
            System.out.println("Ресурс автомобиля исчерпан, необходим ремонт.");
        }
        return distance;
    }
}
