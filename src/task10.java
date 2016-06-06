
import java.util.ArrayList;

/**
 * @author var1541b
 */
public class task10 {

    interface PassangersAuto {

        void transportPass();
    }

    interface CargoAuto {

        void transportCargo();
    }

    static class Truck implements CargoAuto {

        @Override
        public void transportCargo() {
            System.out.println("Трак может делать: *Перевозить груз!");
        }
    }

    static class Sedan implements PassangersAuto {

        @Override
        public void transportPass() {
            System.out.println("Седан может делать: *Перевозить пассажиров");
        }
    }

    static class Pickup implements PassangersAuto, CargoAuto {

        @Override
        public void transportPass() {
            System.out.println("Пикап может делать:");
            System.out.println("*Перевозить пассажиров");
        }

        @Override
        public void transportCargo() {
            System.out.println("*Перевозить груз!");
        }
    }

    public static void main(String[] args) {
        ArrayList auto = new ArrayList();
        auto.add(new Truck());
        auto.add(new Sedan());
        auto.add(new Pickup());

        for (Object transport : auto) {
            if ((transport instanceof PassangersAuto) && (transport instanceof CargoAuto)) {
                PassangersAuto transPass = (PassangersAuto) transport;
                transPass.transportPass();
                CargoAuto transCargo = (CargoAuto) transport;
                transCargo.transportCargo();
            } else if (transport instanceof CargoAuto) {
                CargoAuto transCargo = (CargoAuto) transport;
                transCargo.transportCargo();
            } else {
                PassangersAuto transPass = (PassangersAuto) transport;
                transPass.transportPass();

            }
        }
    }
}
