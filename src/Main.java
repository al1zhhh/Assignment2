public class Main {
    public static void main(String[] args){
        System.out.println("====Vehicle managing system====");

        Driver driver1 = new Driver("Alizhan Sagynbekov" , "KZ-77777");
        Driver driver2 = new Driver("Adilzhan Abilmansur","KZ-060606");
        Driver driver3 = new Driver("Kurbanbai Sayan" , "KZ-00001");

        Car car = new Car("Lexus RX350",2025,4,"Petrol");
        Motorcycle motorcycle = new Motorcycle("Harley Davidson",2023,true);
        Track track = new Track("Gazel",1990,20.5,7);

        car.setDriver(driver1);
        motorcycle.setDriver(driver2);
        track.setDriver(driver3);

        Vehicle[] vehicles = {car,motorcycle,track};
        for(int i = 0;i< vehicles.length;i++){
            vehicles[i].startEngine();

            vehicles[i].displayInfo();

            if(vehicles[i].getDriver() != null){
                vehicles[i].getDriver().displayDriverInfo();
            }
            else {
                System.out.println("Driver is not set");
            }

            vehicles[i].stopEngine();
        }
        System.out.println("====Programm finished====");
    }
}
