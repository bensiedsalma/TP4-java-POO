package EX8;

public class Avion implements Volant {

    double altitude;

    public void voler() {
        System.out.println("L'avion décolle");
    }

    public void atterrir() {
        System.out.println("L'avion atterrit");
    }

    public void changerAltitude(double altitude) {
        System.out.println("L'avion change d'altitude à " + altitude );
    }

    void embarquerPassagers() {
        System.out.println("Les passagers embarquent");
    }

    void afficherAltitude() {
        System.out.println("Altitude actuelle : " + altitude );
    }
}
