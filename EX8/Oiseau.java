package EX8;

public class Oiseau implements Volant{
	double altitude;
	public void voler() {
        System.out.println("L'oiseau vole");
    }
	public void atterrir() {
        System.out.println("L'oiseau atterrit");
    }
	public void changerAltitude(double altitude) {
        System.out.println("L'oiseau change d'altitude à " + altitude );
    }
	void migrer() {
        System.out.println("L'oiseau migre vers une autre région");
    }
	public void construireNid() {
        System.out.println("L'oiseau construit son nid");
    }
}

