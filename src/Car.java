public class Car extends Vehicle{
    private int doors;
    private String fuelType;

    public Car(String brand,int year,int doors,String fuelType){
        super(brand,year);
        this.doors=doors;
        this.fuelType=fuelType;
    }
    @Override

    public void startEngine(){
        System.out.println("Car: " + brand + " " + "Starting engine...");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car: " + brand + " " + "Stopping engine...");
        System.out.println("====================");
    }

    @Override

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type: Car");
        System.out.println("Number of Doors: " + doors + " " + "Fuel type: " + fuelType);
    }






}
