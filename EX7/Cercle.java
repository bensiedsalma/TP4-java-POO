package EX7;

public class  Cercle extends Forme {
	double rayon;

    public Cercle(double rayon) {
    	this.rayon = rayon;
    }
	double calculerSurface() {
		return Math.PI * rayon * rayon;
    }
	double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
	 boolean validerDimensions() {
	        return rayon > 0;
	    }

}
