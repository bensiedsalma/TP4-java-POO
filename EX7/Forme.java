package EX7;

public abstract class Forme {
	abstract double calculerSurface();
	void afficherDescription() {
		System.out.println("Je suis une forme géométrique.");
    }
	int comparerSurface(Forme f) {
        if (this.calculerSurface() > f.calculerSurface())
            return 1;
        else if (this.calculerSurface() < f.calculerSurface())
            return -1;
        else
            return 0;
    }

}
