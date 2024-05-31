// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Create Watercraft objects
        Watercraft sailingShip = new SailingShip("Airwave", 150, 1930, "Sailing Ship", "Johnson");
        Watercraft trawler = new Trawler("Moby Dick", 125, 1980, "Trawler", "Heck");
        Watercraft motorboat = new Motorboat("Royal", 115, 2020, "Motorboat", "Foreman");

        // Show the details and swim
        sailingShip.show();
        sailingShip.swim();

        trawler.show();
        trawler.swim();

        motorboat.show();
        motorboat.swim();
    }
}
