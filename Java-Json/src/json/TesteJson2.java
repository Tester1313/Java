package json;

import org.json.*;

public class TesteJson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* -------------------------------------------------------
		 * TESTE 2
		 * cria um JSONObject a partir de uma string 
		 * -------------------------------------------------------*/
		
		//string json
		String json_str = "{\"titulo\":\"Os Arquivos JSON\",\"ano\":1998, \"genero\":\"Ficção\"}";
		//String json_str = "{\"Teste:}";
		// Novo objeto porem com entrada
		JSONObject myObj = new JSONObject(json_str);
		
		// Pega cada um atravez do get e imprime
		String titulo = myObj.getString("titulo");
		int ano = myObj.getInt("ano");
		String genero = myObj.getString("genero");
		
		System.out.println("Titulo: "+ titulo);
		System.out.println("Ano: "+ ano);
		System.out.println("Titulo: "+ genero);
	}

}
