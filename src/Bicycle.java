public class Bicycle {

    public int wheelsCount;
    private String modelName;



    public Bicycle(String modelName, int wheelsCount) {
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
            System.out.println("Меняем покрышку");
    }

}

