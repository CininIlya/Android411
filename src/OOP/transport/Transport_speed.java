package OOP.transport;

public class Transport_speed {

        enum Speed{
            Car("CAR",65),
            Truck("TRUCK",55),
            Airplane("AIRPLANE",600),
            Train("TRAIN",70),
            Boat("BOAT",22);

            String name;
            int d;

            Speed(String name, int d) {
                this.name = name;
                this.d = d;
            }

            @Override
            public String toString() {
                return name;
            }
            int Speed_tr(Speed val){
                return val.d;
            }
        }
        public static void main(String[] args){
            System.out.println("Скорость транспортных средств: ");
            for (Speed S1 : Speed.values())
                System.out.println(S1 + " типичная скорость составляет " + S1.Speed_tr(S1) + " миль в час. ");

        }
        }