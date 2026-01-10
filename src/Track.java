public class Track extends Vehicle {
    private double capacity;
    private int numAxes;

    public Track(String brand,int year,double capacity,int numAxes){
        super(brand,year);
        this.capacity=capacity;
        this.numAxes=numAxes;
    }

    @Override

    public void startEngine(){
        System.out.println("Track " + brand + " " + "starting engine...");
    }

    @Override

    public void stopEngine(){
        System.out.println("Track " + brand + " " +  "stopping engine...");
        System.out.println("====================");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type: Track");
        System.out.println("Capacity: " + capacity + " tones, axes: " + numAxes);
    }
}
