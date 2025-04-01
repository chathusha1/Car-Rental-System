public class PremiumCar extends Car{
    private boolean includesAdditionalServices;

    public PremiumCar(String model, String renterName, double duration, boolean includesAdditionalServices){
        super(model, renterName, duration);
        this.includesAdditionalServices=includesAdditionalServices;
    }

    @Override
    public double calculateRentalcost() {
        double cost = 100.0 * getDuration();
        if(includesAdditionalServices){
            cost += 50.0;
        }
        return cost;
    }
}
