

// Parent class Watercraft
public class Watercraft {
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
