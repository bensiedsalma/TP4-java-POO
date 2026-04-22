package EX10;

public class Magazine extends Document implements Empruntable {
	int numero;
	String datePublication;
	public Magazine(String identifiant, String titre, String auteur, int numero,String datePublication) {
        super(identifiant, titre, auteur);
        this.numero = numero;
        this.datePublication = datePublication;}
	int calculerDureeEmpruntMax() {
		return 10;}
	public boolean estDisponible() {
        return etat;}
	 public void reserver() {
	        System.out.println("Magazine réservé");}
	void estRecent() {
        System.out.println("Magazine récent");}
    void afficherEdition() {
        System.out.println("Numéro : " + numero);
        System.out.println("datePublication:"+datePublication);}}
	
