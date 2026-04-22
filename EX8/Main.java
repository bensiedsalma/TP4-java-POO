package EX8;

public class Main {
	public static void main(String[] args) {

        Oiseau O = new Oiseau();
        Avion A = new Avion();
        O.voler();
        O.changerAltitude(100);
        O.migrer();
        O.construireNid();

        A.voler();
        A.changerAltitude(10000);
        A.embarquerPassagers();
        A.afficherAltitude();
    }
}