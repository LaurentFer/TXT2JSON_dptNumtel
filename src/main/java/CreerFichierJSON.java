import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreerFichierJSON {

	public static void CreeJSON(String nomFichier,String organisme,String departement,String sonNumero){
		
		try{
			FileWriter 		fw		= new FileWriter(nomFichier);
			BufferedWriter	bw		= new BufferedWriter(fw);
			PrintWriter		pw		= new PrintWriter(bw);
					
			//Alimentation du fichier json (format de base, si boucle 'for' destinée à lancer le traitement sur tous les départements
			//il faudra rajouter les ',' jusqu'à l'avant dernier élément
			pw.println("{");
			pw.println("\""+departement+"\""+":"+"\""+sonNumero+"\"");
			pw.println("}");
			pw.close();
			System.out.println("Creation du fichier realisee");
			
		} catch (IOException ec){
			System.out.println("Probleme a la creation du fichier");
		}
		
	}
	
}
