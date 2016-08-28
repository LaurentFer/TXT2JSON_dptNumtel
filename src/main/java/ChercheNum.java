import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ChercheNum {

	public static String ChercheCeNum(String dpt,String fichier){
		
		String monService 		= fichier;
		String monDepartement 	= dpt;
		String maLigneTrouvee	= "";
		
				//Lecture du fichier des numéros de téléphone
				try{
					FileReader 		fr		 	= new FileReader(monService);
					BufferedReader 	br		 	= new BufferedReader(fr);
					String 			ligne	 	= br.readLine();
					boolean			trouve		= false;						//passe a vrai une fois la ligne trouvée
					
					while (ligne !=null && !trouve){
						//on teste si le dpt est trouvé dans les 3 premiers char de la ligne en cours
						if (ligne.substring(0, 3).contains(monDepartement)){	
							System.out.println("correspondance trouvée");
							trouve = true;
							maLigneTrouvee = ligne;								//si oui on l'affecte à la variable de retour
						} else {
							System.out.println("correspondance non trouvée");	//si non le booléen reste a false
						}
						
						ligne=br.readLine();									//et on passe à la ligne suivante
					}
					
					br.close();		
					
				} catch (FileNotFoundException e){ 								//Si le fichier de conf n'existe pas
					System.out.println("Le fichier n'est pas présent dans le répertoire");

				} catch (IOException e){										//Si autre exception levée
					System.out.println("Probleme de lecture du fichier");
				}
				
				return maLigneTrouvee;
	}
	
}
