package testes;

import model.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		//Para criarmos um OBJETO, ou seja, para USARMOS a nossa classe em uma instância específica, devemos escrever o nome da classe, o nome do objeto que será criado
		Cliente cliente = new Cliente();
		//Como criamos o objeto cliente utilizando o construtor VAZIO, nossos atributos continuam vazios. Vemos isso se tentarmos exibir o método toString() dele:
		System.out.println(cliente.toString());
		
		//Se tivéssemos instanciado o objeto com o outro construtor, poderíamos atribuir valores aos atributos logo no momento de instanciar:
		Cliente cliente2 = new Cliente(1, "Paul Atreides", "paul@muaddib.com");
		System.out.println(cliente.toString());
		
		
	}

}
