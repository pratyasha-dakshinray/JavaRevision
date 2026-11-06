package parentchild.vehicle;

public class TataCars {
    String brandName = "Tata Motors";
    String country = "India";
    String fuelType = "Petrol / Diesel";
    String vehicleCategory = "SUV";

    public TataCars(){
        System.out.println("Tata Cars Parent Constructor");
    }
    public void DisplayCompanyDetails(){
        System.out.println("Brand name : " + brandName);
        System.out.println("Country : " + country);
        System.out.println("FuelType : " + fuelType);
        System.out.println("Vehicle Category : " + vehicleCategory);
    }
    public void startEngine(){
        System.out.println("Starting Engine");
    }
    public void stopEngine(){
        System.out.println("Stopping Engine");
    }
    public void fuelType(){
        System.out.println("Fuel Type : " + fuelType);
    }
    public void onRoadPriceCalculation(double price){
        System.out.println("On Road Price Calculation : ");
        double tax = price * 0.10;
        double onRoadPrice = price + tax;

        System.out.println("Ex-Showroom Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("On-Road Price: " + onRoadPrice);

    }
}
