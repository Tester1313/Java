package aula36;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone(tel);
		
		////Relecionamento tem-um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing1");
		end.setCep("99999999");
		
		contato.setEndereco(end);
		
		//Relecionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("43");
		telefone.setNumero("3426-9349");
		
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("11");
		telefone2.setNumero("4002-8922");
		//contato.setTelefone(tel);// Passa o objeto telefone para a classe contato
		
		Telefone[] telefones = new Telefone[2];
		telefones[0]= telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		//Teste saída console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefones() != null) {
			System.out.println(contato.getTelefones().getDdd()+" "+contato.getTelefone().getNumero());
		}*/
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd()+" "+ t.getNumero());
			}
		}
		
	}

}
