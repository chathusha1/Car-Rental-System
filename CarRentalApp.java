public class CarRentalApp {
    public static void main(String[] args) {
        EconomyCar economyCar= new EconomyCar("Toyota Corolla", "Alice",5);
        PremiumCar premiumCar=new PremiumCar("Tesla Model X","BOB", 3, true);

        economyCar.displayDetails();
        System.out.println("Rental Cost: $"+economyCar.calculateRentalCost());
        System.out.println();
        premiumCar.displayDetails();
        System.out.println("Rental Cost: $"+premiumCar.calculateRentalcost());
    }
}
