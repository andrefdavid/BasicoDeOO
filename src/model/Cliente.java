//A classe Cliente est� guardada dentro do pacote model. Um pacote re�ne as classes que tratam de um mesmo assunto no nosso sistema
package model;
//Nossa classe chama-se Cliente, e ser� usada para definir o que � um Cliente dentro do nosso sistema.
public class Cliente {
	//Para que possamos armazenar informa��es do cliente, criamos atributos. Esses atributos s�o criados como privados, justamente porque queremos que s� a pr�pria classe seja capaz de VER o conte�do desses atributos e armazenar valores neles.
	private Integer id;
	private String nome;
	private String email;
	
	//Para que nosso Cliente possa ser criado na mem�ria RAM do computador, essa classe precisa de um construtor. Se n�o criarmos nenhum, o java criar� um construtor VAZIO. Se o criarmos qualquer construtor, o java deixar� de criar um construtor vazio automaticamente.
	//Basicamente o Construtor serve para executar um conjunto de a��es quando o objeto for criado na RAM
	public Cliente() {
		//Esse � um construtor vazio. Ele n�o executar� nenhuma a��o espec�fica quando o objeto for armazenado na RAM
	}
	
	
	public Cliente(Integer id, String nome, String email) {
		//Esse � um construtor que armazenar� um id, um nome e um email no objeto cliente quando ele for instanciado
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	//Como os nossos atributos foram criados como privados, precisamos criar m�todos para que outras classes consigam manipular nossos atributos

	public Integer getId() {
		//Esse � um m�todo get. A fun��o dele � retornar o valor que est� armazenado no atributo id. Como ele � p�blico, pode ser usado por outras classes
		return id;
	}

	public void setId(Integer id) {
		//Esse � um m�todo set. A fun��o dele � receber um id e armazenar esse id dentro do atributo id. Como ele � p�blico, pode ser usado por outras classes
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
	
	
	//O m�todo abaixo foi chamado de toString() para que ele seja capaz de retornar uma STRING contendo os conte�dos dos atributos da classe Cliente
	
	public String toString() {
		return "ID: " + id + ", NOME: " + nome + " EMAIL: " + email;
	}
	

}
