package parentchild.vehicle;

public class TataSafari extends TataCars{
    String modelName = "Tata Safari";
    int seatingCapacity = 7;
    String transmission = "Manual";
    String engineCapacity = "1956";
    double price = 1800000.00;
    String color = "White";

    public TataSafari(){
        System.out.println("I am Tata Safari class default constructor");
        super();
        System.out.println("I am Tata Safari class child constructor");
    }

    public void sunRoof(){
        System.out.println("Sun Roof availability : No"  );
    }

    public void displayBrandDetails(){
        System.out.println("The brand is - " + super.brandName);
        System.out.println("The brand is from - " + super.country);
        System.out.println("The fuel type of the brand is - " + super.fuelType);
        System.out.println("The vehicle category is - " + super.vehicleCategory);
    }

    public void displaySafariDetails(){
        System.out.println("Tata Safari Details - ");
        System.out.println("madel name = " + modelName);
        System.out.println("seating capacity = " + seatingCapacity);
        System.out.println("transmission = " + transmission);
        System.out.println("engine capacity = " + engineCapacity);
        System.out.println("price = " + price);
        System.out.println("color = " + color);
        }
}
