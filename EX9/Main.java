package EX9;

public class Main {

	public static void main(String[] args) {

        VoitureElectrique v = new VoitureElectrique();
        Moto m = new Moto();
        v.demarrer();
        v.accelerer();
        v.charger();
        v.afficherAutonomie(300);
        m.demarrer();
        m.accelerer();
        m.faireRoueArriere();
    }
}
