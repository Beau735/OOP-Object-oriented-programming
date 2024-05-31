

// Child class Motorboat
public class Motorboat extends Watercraft {
    public Motorboat(String name, int draft, int constructionYear, String type, String owner) {
        super(name, draft, constructionYear, type, owner);
    }

    @Override
    public void swim() {
        System.out.println(name + " drives at high speed.");
    }
}

