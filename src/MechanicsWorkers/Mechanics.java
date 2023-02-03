package MechanicsWorkers;

import Transports.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mechanics {
    private String nameSurname;
    private String company;

    private List<Class<? extends Transport>> carTypes = new ArrayList<>();



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

    public void addAuto(Class<? extends Transport> carType){
        this.carTypes.add(carType);
    }

    public void maintenance(Transport transport) {
        if (this.carTypes.contains(transport.getClass())) {
            System.out.println(transport.getBrand() + transport.getModel() + " - следует провести диагностику.");
        } else System.out.println("Машина не обслуживается");
    }

    public void fixing(Transport transport) {
        if (this.carTypes.contains(transport.getClass())) {
            System.out.println(transport.getBrand() + transport.getModel() + " - следует провести ремонт.");
        } else System.out.println("Машина не может быть отремонтирована.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanics)) return false;
        Mechanics mechanics = (Mechanics) o;
        return nameSurname.equals(mechanics.nameSurname) && company.equals(mechanics.company) && carTypes.equals(mechanics.carTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSurname, company, carTypes);
    }
}
