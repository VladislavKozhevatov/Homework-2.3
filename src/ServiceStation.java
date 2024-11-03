public class ServiceStation implements Service {

        @Override
        public void check(Car car, Bicycle bicycle, Truck truck){
            if (car != null) {
                System.out.println("Обслуживаем " + car.getModelName());
                for (int i = 0; i < car.wheelsCount; i++) {
                    car.updateTyre();
                }
                car.checkEngine();
            } else if (truck != null) {
                System.out.println("Обслуживаем " + truck.getModelName());
                for (int i = 0; i < truck.wheelsCount; i++) {
                    truck.updateTyre();
                }
                truck.checkEngine();
                truck.checkTrailer();
            } else if (bicycle != null) {
                System.out.println("Обслуживаем " + bicycle.getModelName());
                for (int i = 0; i < bicycle.wheelsCount; i++) {
                    bicycle.updateTyre();
            }
        }
    }
}
