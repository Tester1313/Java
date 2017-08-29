package json;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class TesteJson {

	public static void main(String[] args) throws JSONException {
		// Objeto para armazenar informações do Tipo JSONObject
		/* -------------------------------------------------------
		 * TESTE 1 
		 * cria um JSONObject para armazenar dados de um filme
		 * -------------------------------------------------------*/
		
		JSONObject myObj = new JSONObject();
		
		// Coloca valores nesse objeto
		myObj.put("Titulo","JSON x XML: a Batalha Final");
		myObj.put("ano", 2012);
		myObj.put("genero", "Ação");
		
		//t.teste(myObj);
		System.out.println(myObj.get("Titulo")); // Imprime o Titulo
		
		System.out.println(myObj); // Imprime JSON todo
		
		// Serializa para um String e imprime todo o JSON
		String json_string = myObj.toString();
		System.out.println("Variavel json_string: "+json_string);
		
		
		myObj.put("Titulo", "A batalha dos bastardos"); // Altera onde a key = Titulo para a Batalha dos Bastardos 
		System.out.println("Alterado o titulo"+ myObj.toString());
		
		String titulo = myObj.getString("Titulo");
		int ano = myObj.getInt("ano");
		String genero = myObj.getString("genero");
		
		System.out.println(" Titulo: "+titulo);
		System.out.println(" Ano: "+ano);
		System.out.println(" Genero: "+ genero);
	}
}
