public class Mammal extends Animal {
    boolean isFurry;
    int feetAmount;

    public Mammal(String name, String scientific_name, boolean isFurry, int feetAmount) {
        super(name, scientific_name);
        this.isFurry = isFurry;
        this.feetAmount = feetAmount;
    }
    
    public void run() {
        System.out.println(name + " läuft auf " + feetAmount + " Beinen.");
    }
}
