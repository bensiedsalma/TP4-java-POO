package EX5;

public class Main {
	 public static void main(String[] args) {
	        
	       Figure C  =new Cercle(0, 0, 5);
	       Figure T    = new Triangle(10, 10, 3, 4, 5);
	       C.dessiner();
	       C.deplacer(100, 200);
           C.redimensionner(2);
           T.dessiner();
	       T.deplacer(100, 200);
           T.redimensionner(2);
           

}}
