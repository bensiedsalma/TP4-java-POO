package EX1;

public class Main {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("Bensied", "Salma", 20, "ID1", 14.5);

        System.out.println(e1.sePresenter());
        e1.afficherProfil();
        e1.estAdmis();
        e1.estMajeur();
        }
}