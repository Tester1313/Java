package json;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.*;

public class TesteJson4 {

	public static void main(String[] args) throws JSONException {
		/* -------------------------------------------------------
		 * TESTE 4
		 * manipulação de array 
		 * -------------------------------------------------------*/
		
		//string json: contém array com três elementos
		String json_str = "{\"elenco\":[\"Json Leigh\", \"Mary Stylesheet\", \"David Markupovny\"]}";

		
		// Instancia novo JSONObject passando a string com o entrada
		JSONObject myObj = new JSONObject(json_str);
		
		//Recupera o Array "elenco"
		JSONArray elenco = myObj.getJSONArray("elenco");
		
		// Imprime cada Ator / Atrizz do elenco com o uso dos métodos length() e get()
		System.out.println("Elenco Original");
		
		for(int i = 0; i < elenco.length(); i++) {
			System.out.println("("+i+")"+elenco.get(i));
		}
		
		System.out.println();
		
		// Remove terceiro ator
		elenco.remove(2);
		elenco.put("Teste");
		
		System.out.println("Elenco com o ator David removido");
		for( int i = 0; i < elenco.length(); i++) {
			System.out.println(elenco.get(i));
		}
	}

}
