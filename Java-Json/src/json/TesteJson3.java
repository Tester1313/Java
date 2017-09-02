package json;
import org.json.*;

public class TesteJson3 {

	public static void main(String[] args) {
		
		/* ----------------------------------------------
		 * TESTE 3
		 * Trabalhando com um array de strings 
		 * ---------------------------------------------*/
		
		JSONObject myObj = new JSONObject();
		
		
		// Preencher objeto
		myObj.put("titulo", "JSON x XML: a Batalha Final");
		myObj.put("ano", 2012);
		
		// Cria um JSONArray
		JSONArray my_genres = new JSONArray();
		
		my_genres.put("aventura");
		my_genres.put("ação");
		my_genres.put("ficção");
		
		//insere o array no JSONObject com o rótulo "generos"
		myObj.put("generos",my_genres);
		//my_genres.put(myObj);
		
		//serializa para uma string e imprime
		String json_string = myObj.toString();
		System.out.println(json_string);
	}

}
