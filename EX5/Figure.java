package EX5;

public class Figure {
	 protected double x;
	 protected double y;
	public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
	

	void dessiner() {
		System.out.println("Dessiner une figure");
	}
	 void deplacer(double x, double y) {
	        this.x = x;
	        this.y = y;     
	 }
	 void redimensionner(double facteur) {
	        System.out.println("Redimensionnement avec facteur " + facteur);
	    }
}
