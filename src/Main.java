import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Enumerations.BodyType;
import Enumerations.Capacity;
import Enumerations.LoadCapacity;
import Transports.Bus;
import Transports.Cargo;
import Transports.Passanger;

public class Main {
    public static void main(String[] args) {


        Bus scania = new Bus("Scania", "Touring", 13.0, Capacity.XL);
        Bus maz = new Bus("MAZ", "206", 4.2,null);
        Bus mercedes = new Bus("Mercedes", "Sprinter", 3.0,Capacity.S);

        Passanger bmw = new Passanger("BMW", "M5", 4.3, BodyType.COUPE);
        Passanger skoda = new Passanger("Skoda", "Superb", 3.6, BodyType.UNIVERSAL);
        Passanger toyota = new Passanger("Toyota", "Tundra", 7.6, BodyType.PICKUP);

        Cargo kamaz = new Cargo("KamAZ", "54907", 13.0, LoadCapacity.N2);
        Cargo hyndai = new Cargo("Hyndai", "Mighty", 3.9, LoadCapacity.N1);
        Cargo freighliner = new Cargo("Freighliner", "Cascadia", 12.9, LoadCapacity.N2);
        ///Распечатываем конструктор классов автомобилей
        System.out.println(scania);
        System.out.println(maz);
        System.out.println(mercedes);
        System.out.println();
        System.out.println(bmw);
        System.out.println(skoda);
        System.out.println(toyota);
        System.out.println();
        System.out.println(kamaz);
        System.out.println(hyndai);
        System.out.println(freighliner);
        System.out.println();
        ///Проверяем методы стоп и начать движение
        scania.movement();
        skoda.stop();
        System.out.println();
        ///Проверяем имплементированные методы
        bmw.pitStop(12);
        skoda.pitStop(20);
        toyota.pitStop(31);
        kamaz.pitStop(42);
        mercedes.bestTime(12.48);
        maz.maxSpeed(92);
        System.out.println();
        ///Проводим проверку класса водитель и проверку методов
        DriverB gosling = new DriverB("Rayan 'Drive' Gosling", true, 15, "");
        DriverC hardy = new DriverC("Tom 'MadMax' Hardy", true, 18, "");
        DriverD reeves = new DriverD("Keanu 'Speed' Reeves", true, 21, "");
        System.out.println(gosling);
        System.out.println(hardy);
        System.out.println(reeves);
        System.out.println();
        gosling.refuel();
        hardy.movement();
        reeves.stop();
        System.out.println();
        ///Проверяем полиморфизм в конструкторе водителя и транспорта
        Driver<Cargo> tom = new Driver<>("Tom Hardy", true,18, freighliner);
        Driver<Bus> keanu = new Driver<>("Keanu Reeves", true,21, mercedes);
        Driver<Passanger> rayan = new Driver<>("Rayan Gosling", true, 15, bmw);
        rayan.toRace(bmw);
        keanu.toRace(mercedes);
        tom.toRace(freighliner);
        rayan.toRace(skoda);
        System.out.println();
        ///Проверяем метод printType с Enum.
        scania.printType();
        maz.printType();
        mercedes.printType();
        System.out.println();
        bmw.printType();
        skoda.printType();
        toyota.printType();
        System.out.println();
        kamaz.printType();
        hyndai.printType();
        freighliner.printType();
        System.out.println();

    }
}