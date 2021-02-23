//A classe Cliente está guardada dentro do pacote model. Um pacote reúne as classes que tratam de um mesmo assunto no nosso sistema
package model;
//Nossa classe chama-se Cliente, e será usada para definir o que é um Cliente dentro do nosso sistema.
public class Cliente {
	//Para que possamos armazenar informações do cliente, criamos atributos. Esses atributos são criados como privados, justamente porque queremos que só a própria classe seja capaz de VER o conteúdo desses atributos e armazenar valores neles.
	private Integer id;
	private String nome;
	private String email;
	
	//Para que nosso Cliente possa ser criado na memória RAM do computador, essa classe precisa de um construtor. Se não criarmos nenhum, o java criará um construtor VAZIO. Se o criarmos qualquer construtor, o java deixará de criar um construtor vazio automaticamente.
	//Basicamente o Construtor serve para executar um conjunto de ações quando o objeto for criado na RAM
	public Cliente() {
		//Esse é um construtor vazio. Ele não executará nenhuma ação específica quando o objeto for armazenado na RAM
	}
	
	
	public Cliente(Integer id, String nome, String email) {
		//Esse é um construtor que armazenará um id, um nome e um email no objeto cliente quando ele for instanciado
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	//Como os nossos atributos foram criados como privados, precisamos criar métodos para que outras classes consigam manipular nossos atributos

	public Integer getId() {
		//Esse é um método get. A função dele é retornar o valor que está armazenado no atributo id. Como ele é público, pode ser usado por outras classes
		return id;
	}

	public void setId(Integer id) {
		//Esse é um método set. A função dele é receber um id e armazenar esse id dentro do atributo id. Como ele é público, pode ser usado por outras classes
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//O método abaixo foi chamado de toString() para que ele seja capaz de retornar uma STRING contendo os conteúdos dos atributos da classe Cliente
	
	public String toString() {
		return "ID: " + id + ", NOME: " + nome + " EMAIL: " + email;
	}
	

}
