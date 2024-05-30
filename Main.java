// Parent class Watercraft
class Watercraft {
    // attributes
    protected String name;
    protected int draft;
    protected int constructionYear;
    protected String type;
    protected String owner;

    // constructor
    public Watercraft(String name, int draft, int constructionYear, String type, String owner) {
        this.name = name;
        this.draft = draft;
        this.constructionYear = constructionYear;
        this.type = type;
        this.owner = owner;
    }

    // Method to show the details
    public void show() {
        System.out.println("Watercraft details:");
        System.out.println("Name: " + name);
        System.out.println("Draft: " + draft + " cm");
        System.out.println("Construction year: " + constructionYear);
        System.out.println("Type: " + type);
        System.out.println("Owner: " + owner);
    }

    // Method for swim
    public void swim() {
        System.out.println(name + " swims in the water.");
    }
}

// Child class SailingShip
class SailingShip extends Watercraft {
    public SailingShip(String name, int draft, int constructionYear, String type, String owner) {
        super(name, draft, constructionYear, type, owner);
    }

    // Method override
    @Override
    public void swim() {
        System.out.println(name + " sails with the wind.");
    }
}

// Child class Trawler
class Trawler extends Watercraft {
    public Trawler(String name, int draft, int constructionYear, String type, String owner) {
        super(name, draft, constructionYear, type, owner);
    }

    @Override
    public void swim() {
        System.out.println(name + " is fishing.");
    }
}

// Child class Motorboat
class Motorboat extends Watercraft {
    public Motorboat(String name, int draft, int constructionYear, String type, String owner) {
        super(name, draft, constructionYear, type, owner);
    }

    @Override
    public void swim() {
        System.out.println(name + " drives at high speed.");
    }
}

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
