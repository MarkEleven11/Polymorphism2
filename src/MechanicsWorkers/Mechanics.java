package MechanicsWorkers;

import Drivers.Driver;
import Transports.Bus;
import Transports.Passanger;
import Transports.Transport;

public class Mechanics <M extends Driver> {
    private String nameSurname;
    private String company;
    private M racer;
    private Transport transport;

    public Mechanics(String nameSurname, String company, M racer, Transport transport) {
        this.nameSurname = nameSurname;
        this.company = company;
        this.racer = racer;
        this.transport = transport;

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

    public M getRacer() {
        return racer;
    }

    public void setRacer(M racer) {
        this.racer = racer;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public String toString () {
        return "Механик " + getNameSurname() + " от компании " + getCompany();
    }


    public void infoAbout() {
        System.out.println(getRacer() + " имеет автомобиль " + getTransport() + ", который обслуживает механик " + getNameSurname());
    }
}
