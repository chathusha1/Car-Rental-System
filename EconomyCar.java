public class EconomyCar extends Car {
    public EconomyCar(String model, String renterName, double duration){
        super(model, renterName, duration);
    }

    public double calculateRentalCost(){
        return 40.0*super.calculateRentalcost(); //Discount rate
    }
}
