

// Child class SailingShip
public class SailingShip extends Watercraft {
    public SailingShip(String name, int draft, int constructionYear, String type, String owner) {
        super(name, draft, constructionYear, type, owner);
    }

    // Method override
    @Override
    public void swim() {
        System.out.println(name + " sails with the wind.");
    }
}

