public abstract class WheelTransport implements Transport{

        private int wheelsCount;
        private String modelName;


        public WheelTransport(String modelName, int wheelsCount) {
            this.modelName = modelName;
            this.wheelsCount = wheelsCount;
        }

        public String getModelName() {
            return modelName;
        }


        public int getWheelsCount() {
            return wheelsCount;
        }


        public void updateTyre() {
            System.out.println("Меняем покрышку у " + getModelName());
        }

        public void service(){
            for (int i = 0; i < wheelsCount; i++) {
                updateTyre();
            }
        }
}

