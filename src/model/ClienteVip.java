package model;
//Se quisermos que a classe "ClienteVip" seja do "tipo" Cliente e, portanto, tenha a mesma estrutura da classe Cliente, podemos utilizar a HERAN�A.
//A heran�a, atrav�s do comando extends, vai fazer com que a classe ClienteVip herde todos os atributos e m�todos n�o privados da classe Cliente, exceto o construtor.
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
	//Como a classe pai j� possui um toString, precisamos fazer a anota��o "Override" para indicar que o m�todo da classe pai est� sendo ignorado e estamos usando o m�todo abaixo
	@Override
	public String toString() {
		//Para enriquecer o exemplo, estamos chamando o toString() da classe pai. Para fazer isso, indicamos super (que significa superclasse, ou seja, classe pai) e indicando o m�todo.
		return super.toString() + " CUPOM: " + cupomVip;
	}
	
	

}
