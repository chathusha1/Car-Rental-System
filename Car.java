public class Car {
    private String model;
    private String renterName;
    private double duration;

    public Car(String model, String renterName, double duration) {
        this.model=model;
        this.renterName=renterName;
        this.duration=duration;
    }
    protected double getDuration() {
        return duration;
    }

    public void displayDetails(){
        System.out.println("Model: "+model);
        System.out.println("Renter Name: "+renterName);
        System.out.println("Rental Duration:Days "+duration);
    }
    public double calculateRentalcost(){
        return 50.0*duration; // Default rate
    }
}
