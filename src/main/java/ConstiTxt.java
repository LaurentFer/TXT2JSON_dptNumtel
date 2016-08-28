public class ConstiTxt {

	public static void main(String[] args) {

		String organisme 			= "sdis";
		String departement			= "81";
		
		//On déclare et initialise une variable avec le retour de la fonction ChercheCeNum 
		//qui prend en paramètre le numéro du département et le fichier dans lequel le chercher
		String LigneDansLeFichier 	= ChercheNum.ChercheCeNum(departement,organisme+".txt");
		
		if (LigneDansLeFichier!=""){
			//On lance la fonction qui va analyser le contenu de cette ligne pour nous renvoyer le numéro de téléphone
			String leNumero 				= AnalyseLigne.AnalyseCetteLigne(LigneDansLeFichier);
	
			//On lance la méthode qui va agréger le nom de l'organisme et son numero dans un fichier JSON
			CreerFichierJSON.CreeJSON(departement+organisme.toUpperCase()+".json",organisme,departement,leNumero);
		} else {
			System.out.println("La correspondance n'existe pas");
		}
		
	}

}
