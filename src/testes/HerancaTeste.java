package testes;

import model.ClienteVip;

public class HerancaTeste {

	public static void main(String[] args) {
		//Se criarmos um objeto do tipo ClienteVip, ele conterá todos os métodos que foram herdados da classe Cliente
		ClienteVip cliente = new ClienteVip();
		//Veja que podemos utilizar o método setId mesmo sem ele ter sido criado na classe ClienteVip, justamente porque ele foi herdado da classe pai
		cliente.setId(1);
		//O mesmo se dá com os outros métodos herdados
		cliente.setNome("Paul Atreides");
		cliente.setEmail("paul@muaddib.com");
		//E, é claro, podemos usar o método que criamos apenas na classe ClienteVip
		cliente.setCupomVip("DUNA");
		
		
		System.out.println(cliente.toString());
		

	}

}
