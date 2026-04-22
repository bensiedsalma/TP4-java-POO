package EX7;

public class Rectangle extends Forme {
	double largeur;
	double hauteur;
	 public Rectangle(double largeur, double hauteur) {
	        this.largeur = largeur;
	        this.hauteur = hauteur;
	    }
	double calculerSurface() {
		return largeur * hauteur;
	}

}
