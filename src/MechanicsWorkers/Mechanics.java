package MechanicsWorkers;

import Drivers.Driver;
import Transports.Passanger;
import Transports.Transport;

public class Mechanics <M,T extends Driver> {
    private String nameSurname;
    private String company;
    private M vechicle;
    private T racer;

    public Mechanics(String nameSurname, String company, M vechicle, T racer) {
        this.nameSurname = nameSurname;
        this.company = company;
        this.vechicle = vechicle;
        this.racer = racer;

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

    public T getRacer() {
        return racer;
    }

    public void setRacer(T racer) {
        this.racer = racer;
    }


     public String toString () {
        return "Механик " + getNameSurname() + " от компании " + getCompany();
    }


    public void infoAboutVechicle() {
        System.out.println("У водителя ");
    }
}
