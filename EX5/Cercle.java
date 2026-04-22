package EX5;

public class Cercle extends Figure {
	double rayon;
	public Cercle(double x, double y,double rayon) {
		super(x, y);
		this.rayon=rayon;
	}
	void  dessiner() {
		System.out.println("Dessiner un Cercle");
	}
	double calculerPerimetre() {
		return 2 * Math.PI * rayon;
		
	}
	double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
	
}
