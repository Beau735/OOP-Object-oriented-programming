

// Child class Trawler
public class Trawler extends Watercraft {
    public Trawler(String name, int draft, int constructionYear, String type, String owner) {
        super(name, draft, constructionYear, type, owner);
    }

    @Override
    public void swim() {
        System.out.println(name + " is fishing.");
    }
}

