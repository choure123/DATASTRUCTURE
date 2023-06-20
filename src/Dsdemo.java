//ObjectModelingCar
public class Dsdemo {
    public static void main(String[] args) {
        Car c1 = new Car("BMW","M2","Seadan",2995,10.0);
        Bike b1 = new Bike("Honda","CBR250R","Sports",250, 30.0);
        System.out.println(c1);
        c1.run();
        System.out.println(b1);
        b1.run();

    }
}
    interface Vehicle{
        public void run();
    }

    class Car implements Vehicle{
        String brand;
        String model;
        String type;
        int displacement;
        double mileage;
        public Car(String brand, String model, String type, int displacement ,double mileage){
            this.brand = brand;
            this.model = model;
            this.type = type;
            this.displacement = displacement;
            this.mileage = mileage;
        }

        @Override
        public void run() {
            System.out.println("Car is running");
        }

        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", type='" + type + '\'' +
                    ", displacement=" + displacement +
                    ", mileage=" + mileage +
                    '}';
        }
    }
    class Bike implements Vehicle{
        String brand;
        String model;
        String type;
        int displacement;
        double mileage;

        public Bike(String brand, String model, String type, int displacement, double mileage) {
            this.brand = brand;
            this.model = model;
            this.type = type;
            this.displacement = displacement;
            this.mileage = mileage;
        }

        @Override
        public void run() {
            System.out.println("Bike is running");
        }

        @Override
        public String toString() {
            return "Bike{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", type='" + type + '\'' +
                    ", displacement=" + displacement +
                    ", mileage=" + mileage +
                    '}';
        }
    }

