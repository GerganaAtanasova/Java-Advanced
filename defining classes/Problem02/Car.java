package Classes;

public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public Car(String brand, String model, int horsepower){
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }
    public Car(String brand, String model){
        this(brand,model,0);
    }
    public Car(String brand,int horsepower){
        this(brand,"unknown",horsepower);
    }
    public Car(String brand){
        this(brand,"unknown",-1);
    }


    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsepower);
    }
}
