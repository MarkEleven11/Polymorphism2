import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Enumerations.BodyType;
import Enumerations.Capacity;
import Enumerations.LoadCapacity;
import Exeptions.ImmposiblePassDiagnostic;
import Exeptions.NoAccesExeption;
import MechanicsWorkers.Mechanics;
import Transports.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ImmposiblePassDiagnostic, NoAccesExeption {


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
        DriverB gosling = new DriverB("Rayan 'Drive' Gosling", true, 15, bmw, "B");
        DriverC hardy = new DriverC("Tom 'MadMax' Hardy", true, 19, freighliner, "C");
        DriverD reeves = new DriverD("Keanu 'Speed' Reeves", true, 21, scania, "D");
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
        rayan.toRace();
        keanu.toRace();
        tom.toRace();
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

        ///Проверка метода Диагностика
        kamaz.diagnostic(-5);
        toyota.diagnostic(41);
        System.out.println();

        ///Проверка Exeptions
        try {
            mercedes.diagnostic(0);
        } catch (ImmposiblePassDiagnostic e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Перейти к диагностике следующего автомобиля");
        }

        try {
            new DriverB("Kanye West", true, 2, skoda, "B");
        } catch (NoAccesExeption e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Водитель не допущен до соревнований");
        }
        System.out.println();

        //Создание списка автомобилей участвующих в гонке
        List<Transport<?>> transportList = new ArrayList<>();
        transportList.add(scania);
        transportList.add(maz);
        transportList.add(mercedes);
        transportList.add(bmw);
        transportList.add(skoda);
        transportList.add(toyota);
        transportList.add(kamaz);
        transportList.add(hyndai);
        transportList.add(freighliner);
        System.out.println(transportList);



        ///Работа с коллекциями ArrayList
        Mechanics statham = new Mechanics("Jason Stathem", "BadCompany");
        Mechanics diesel = new Mechanics("Vin Diesel", "BlablaCar");
        Mechanics bale = new Mechanics("Christian Bale","FordMotors");

//        statham.addAuto(Bus.class);


        /// Проверка метода провести ТО и ремонт List и Queue
        MaintanenceStation maintanenceStation = new MaintanenceStation();
        maintanenceStation.addTransport(maz);
        maintanenceStation.doingMaintrance();
        maintanenceStation.addTransport(skoda);
        maintanenceStation.doingMaintrance();
        maintanenceStation.addTransport(hyndai);
        maintanenceStation.doingMaintrance();

        //Работа с Map

    }
}