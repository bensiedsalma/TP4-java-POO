package EX3;

public class Main {
    public static void main(String[] args) {

        CompteCourant cc = new CompteCourant(1000, 50);

        cc.deposer(200);
        cc.autoriserDecouvert(1300);
        cc.retirer(1300); 
        cc.afficher();


        CompteEpargne ce = new CompteEpargne(2000, 0.03);

        ce.deposer(500);
        ce.calculerInterets();
        ce.ajouterInterets();

        ce.afficher();
    }
}
