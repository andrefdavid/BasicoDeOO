package testes;

import model.ClienteVip;

public class HerancaTeste {

	public static void main(String[] args) {
		//Se criarmos um objeto do tipo ClienteVip, ele conter� todos os m�todos que foram herdados da classe Cliente
		ClienteVip cliente = new ClienteVip();
		//Veja que podemos utilizar o m�todo setId mesmo sem ele ter sido criado na classe ClienteVip, justamente porque ele foi herdado da classe pai
		cliente.setId(1);
		//O mesmo se d� com os outros m�todos herdados
		cliente.setNome("Paul Atreides");
		cliente.setEmail("paul@muaddib.com");
		//E, � claro, podemos usar o m�todo que criamos apenas na classe ClienteVip
		cliente.setCupomVip("DUNA");
		
		
		System.out.println(cliente.toString());
		

	}

}
