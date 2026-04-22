package EX5;

public class Triangle extends Figure {
	double a, b, c;
	public Triangle(double x, double y ,double a, double b, double c) {
		super(x, y);
		this.a = a;
        this.b = b;
        this.c = c;
	}

	void  dessiner() {
		System.out.println("Dessiner un Triangle");
	}
	double calculerPerimetre() {
        return a + b + c;
    }
	double calculerSurface() {
        double s = calculerPerimetre() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
