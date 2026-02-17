//Start.java

public class Start {
    public static void main(String[] args) {
        Cat persik = new Cat("Persik", "Felis catus", true, 4, "Möhren");
        persik.check();
        persik.showScientificName();
        persik.run();
        persik.isHungry();
        System.out.println("Lieblingsessen: " + persik.favFood);
        persik.eat();
        persik.sleep();
        persik.drink();
    }
}
