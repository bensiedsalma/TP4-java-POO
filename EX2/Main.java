package EX2;

public class Main {
	public static void main(String[] args) {

        Voiture v1 = new Voiture("Toyota", 4, "Diesel","Rouge");

        v1.afficherDetails();
        v1.demarrer();
        v1.klaxonner();
        v1.arreter();
    }
}


