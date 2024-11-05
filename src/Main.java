import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);


        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);


        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        Transport[] transports ={
                car,
                car2,
                truck,
                truck2,
                bicycle,
                bicycle2

        };


        ServiceStation station = new ServiceStation();

        for (Transport transport: transports){
            station.check(transport);
            System.out.println();
        }
    }
}


//           Car car = new Car("car1",4);
//        Car car2 = new Car("car2",4);
//
//
//        Truck truck = new Truck("truck1",6);
//        Truck truck2 = new Truck("truck2",8);
//
//
//        Bicycle bicycle = new Bicycle("bicycle1",2);
//        Bicycle bicycle2 = new Bicycle("bicycle2",2);
//
//
//        ServiceStation station = new ServiceStation();
//        station.check(car, null, null);
//        station.check(car2, null, null);
//        station.check(null, bicycle, null);
//        station.check(null, bicycle2, null);
//        station.check(null, null, truck);
//        station.check(null, null, truck2);



// Предыдущие наброски задачи
// //Задача 1
//        Bicycle bicycle = new Bicycle("Аист ",2);
//        System.out.println(" Велосипед - " + bicycle.getModelName() + ", Кол-во колёс = "+bicycle.getWheelsCount());
//        bicycle.updateTyre();
//    //Задача 2
//        Car car = new Car("BMW",4);
//        System.out.println("Машина - " + car.getModelName() + ", Кол-во  клоёс = " +car.getWheelsCount());
//        car.updateTyre();
//        car.checkEngine();
//        //Задача 3
//        Truck truck = new Truck("Scania",6);
//        System.out.println("Грузовик - "+ truck.getModelName()+", Кол-во колёс - "+ truck.getWheelsCount());
//        truck.checkEngine();
//        truck.checkTrailer();
//        System.out.println("Машина - " + car.getModelName() + ", Кол-во  клоёс = " +car.getWheelsCount());
//        car.updateTyre();
//        car.checkEngine();
//        //Задача 4 уже выполнена
//        //Задача 5 Измёнён метод main согласно тексту задачи