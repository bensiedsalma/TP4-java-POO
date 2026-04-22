package EX7;

public class Main {
    public static void main(String[] args) {

        Forme r = new Rectangle(4, 5);
        Forme c = new Cercle(3);

        r.afficherDescription();
        System.out.println("Surface rectangle : " + r.calculerSurface());

        c.afficherDescription();
        System.out.println("Surface cercle : " + c.calculerSurface());

        r.comparerSurface(c);
    }
}