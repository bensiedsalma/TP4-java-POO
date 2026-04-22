package EX10;

public class DocumentNumerique extends Document implements Consultable {
	String format;
	double tailleFichier;
	public DocumentNumerique(String identifiant, String titre, String auteur,
	             String format, double tailleFichier) {
		super(identifiant, titre, auteur);
		this.format = format;
		this.tailleFichier = tailleFichier;}
	int calculerDureeEmpruntMax() {
    	 return 3;}
	public void consulter() {
    	System.out.println("Consultation en ligne");
    }
    public void afficherResume() {
    	System.out.println("Résumé numérique");}
    public void telecharger() {
        System.out.println("Téléchargement du document");
    }
    void afficherTaille() {
            System.out.println("Taille : " + tailleFichier);}}


