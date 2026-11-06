package parentchild.vehicle;

public class TataCarTest {
    public static void main(String[] args) {
        System.out.println("Tata Sierra Details - ");

        TataSierra tataSierra = new TataSierra();
        tataSierra.displaySierraDetails();
        tataSierra.displayBrandDetails();
        tataSierra.fuelType();
        tataSierra.sunRoof();
        tataSierra.startEngine();
        tataSierra.stopEngine();
        tataSierra.onRoadPriceCalculation(tataSierra.price);
        System.out.println(tataSierra);


        System.out.println("Tata Safari Details - ");

        TataSafari tataSafari = new TataSafari();
        tataSafari.displaySafariDetails();
        tataSafari.displayBrandDetails();
        tataSafari.fuelType();
        tataSafari.sunRoof();
        tataSafari.startEngine();
        tataSafari.stopEngine();
        tataSafari.onRoadPriceCalculation(tataSafari.price);
        System.out.println(tataSafari);
    }
}
