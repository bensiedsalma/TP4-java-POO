package EX10;

public class Main {
    public static void main(String[] args) {

        Livre livre = new Livre("1", "Java POO", "Salma", 300, "Informatique");
        Magazine magazine = new Magazine("2", "Science", "karima", 45, "2026");
        DocumentNumerique docNum = new DocumentNumerique("3", "Guide PDF", "Ali", "PDF", 2.5);
        Document[] documents = { livre, magazine, docNum };
        for (Document d : documents) {
            d.afficherInformations();
        Utilisateur u = new Utilisateur();
        u.emprunterDocument(livre);
        u.retournerDocument(livre);
        magazine.afficherEdition();
        docNum.telecharger();
        }}}
