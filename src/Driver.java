public class Driver {
    private String name;
    private String licenceNumber;

    public Driver(String name,String licenceNumber){
        this.name=name;
        this.licenceNumber=licenceNumber;
    }

    public void displayDriverInfo(){
        System.out.println("Driver:" + name);
        System.out.println("Licence: " + licenceNumber);

    }

    public String getName() { return name;};
    public String getLicenceNumber(){return licenceNumber;};

}
