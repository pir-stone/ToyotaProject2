package Week1.Cars;

import Week1.Parts.Enums.TransmType;
import Week1.Parts.Wheels;

public abstract class Car {
    String colour;
    int maxSpeed;
    boolean move;
    double price;
    TransmType transmType; //возможно лишнее

    public static class Tank {  //вложенный класс
        private int gazolineCount;  // атрибуты

        public Tank(int gazolineCount) {  //конструктор
            this.gazolineCount = gazolineCount;
        }

        public int gazoline() {
            return gazolineCount;
        }
    }

    public static class Engine {
        private boolean function;

        public Engine(boolean function) {
            this.function = function;
        }
    }

    public static class Electricity {
        private boolean function;

        public Electricity(boolean function) {
            this.function = function;
        }
    }

    public static class Lamps {
        private boolean function;

        public Lamps(boolean function) {
            this.function = function;
        }
    }

    public void Run{
        if ()
    }
}
