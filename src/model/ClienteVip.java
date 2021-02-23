package model;
//Se quisermos que a classe "ClienteVip" seja do "tipo" Cliente e, portanto, tenha a mesma estrutura da classe Cliente, podemos utilizar a HERANÇA.
//A herança, através do comando extends, vai fazer com que a classe ClienteVip herde todos os atributos e métodos não privados da classe Cliente, exceto o construtor.
public class ClienteVip extends Cliente{
	private String cupomVip;

	public ClienteVip() {
		
	}
	
	public ClienteVip(String cupomVip) {
		this.cupomVip = cupomVip;
	}

	public String getCupomVip() {
		return cupomVip;
	}

	public void setCupomVip(String cupomVip) {
		this.cupomVip = cupomVip;
	}
	//Como a classe pai já possui um toString, precisamos fazer a anotação "Override" para indicar que o método da classe pai está sendo ignorado e estamos usando o método abaixo
	@Override
	public String toString() {
		//Para enriquecer o exemplo, estamos chamando o toString() da classe pai. Para fazer isso, indicamos super (que significa superclasse, ou seja, classe pai) e indicando o método.
		return super.toString() + " CUPOM: " + cupomVip;
	}
	
	

}
