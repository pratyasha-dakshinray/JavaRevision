package parentchild.vehicle;

import parentchild.vehicle.TataCars;

public class TataSierra extends TataCars{
    String modelName = "Tata Sierra";
    int seatingCapacity = 5;
    String transmission = "Automatic";
    String engineCapacity = "1498";
    double price = 1500000.00;
    String color = "Red";

    public TataSierra(){
        System.out.println("I am Tata Sierra class default constructor");
        super();
        System.out.println("I am Tata Sierra class child constructor");
    }

    public void sunRoof(){
        System.out.println("Sun Roof availability : Yes"  );
    }

    public void displayBrandDetails(){
        System.out.println("The brand is - " + super.brandName);
        System.out.println("The brand is from - " + super.country);
        System.out.println("The fuel type of the brand is - " + super.fuelType);
        System.out.println("The vehicle category is - " + super.vehicleCategory);
    }

    public void displaySierraDetails(){
        System.out.println("Tata Sierra Details - ");
        System.out.println("madel name = " + modelName);
        System.out.println("seating capacity = " + seatingCapacity);
        System.out.println("transmission = " + transmission);
        System.out.println("engine capacity = " + engineCapacity);
        System.out.println("price = " + price);
        System.out.println("color = " + color);
    }



}
