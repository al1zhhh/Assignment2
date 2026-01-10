public class Motorcycle extends Vehicle{
    private boolean hasSideCar;
    public Motorcycle(String brand,int year,boolean hasSideCar){
        super(brand,year);
        this.hasSideCar=hasSideCar;
    }

    @Override

    public void startEngine(){
        System.out.println("Motorcycle " + brand + " " +  "starting engine...");
    }

    @Override
    public void stopEngine(){
        System.out.println("Motorcycle " + brand + " " + "stopping engine...");
        System.out.println("====================");
    }

    @Override

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type: Motorcycle");
        String sideCar = hasSideCar ? "Yes" : "No";
        System.out.println("Side Car: " + sideCar);
    }
}
