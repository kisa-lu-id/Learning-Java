//Animal.java

public class Animal {
    public String name;
    public String scientific_name;

    public Animal(String name, String scientific_name) { //konstr
        this.name = name;
        this.scientific_name = scientific_name;
        //System.out.println("asdhh");
    }

    public void check() { //meth
        System.out.println("Dies ist ein Tier: " + name);
    }

    public void showScientificName () {
        System.out.println("Sein wissenschaftlicher Name ist: " + scientific_name);
    }
}
