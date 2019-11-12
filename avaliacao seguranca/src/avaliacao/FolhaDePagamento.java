package avaliacao;

import java.text.NumberFormat;
/**
 * A classe deve ter os atributos:
 * nome, 
 * cargo, 
 * salarioBruto, 
 * imposto(%), 
 * salarioLiquido
 * 
 * E os metodos:
 * calcularSalarioLiquido()
 * mostrarFolha()
 *  
 * @author anderson.kruger
 *
 */
public class FolhaDePagamento {
	
	private String nome;
	private String cargo;
	private double salarioBruto;
	private double imposto;
	private double salarioLiquido;
	/**
	 * O salario liquido eh o salario bruto menos o percentual do imposto
	 * Por exemplo: Um salario bruto de R$ 2000 e imposto de 10%, o liquido sera R$ 1800 
	 */
	void calcularSalarioLiquido() {
		
	}
	
	void mostrarFolha() {
		
	}

	public String getnome(String nome) {
		return nome;
		
	}

	public String getcargo(String cargo) {
		return cargo;
		
	}

	public String getsalarioBruto(String salarioBruto) {
		return salarioBruto;
		
	}

	public double getimposto(String string) {
		return imposto;
		
	}

	public double getsalarioLiquido(String string) {
		return salarioLiquido;
		
	}

	
	

	

}
