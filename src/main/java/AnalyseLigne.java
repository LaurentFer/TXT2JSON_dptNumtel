
public class AnalyseLigne {

	public static String AnalyseCetteLigne(String ligneAanalyser){
		
		int positionNumTel 	= ligneAanalyser.substring(3).indexOf("0");			//On cherche la position du 0 (début numero tel) a partir de la sous chaine excluant le dpt
		CharSequence numTel = ligneAanalyser.substring(3).subSequence(positionNumTel,positionNumTel+10);	//On définit une variable qui prend la séquence des 10char a partir de la position précédente
		return numTel.toString();
	}
}
