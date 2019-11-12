package avaliacao;
import javax.swing.JOptionPane;
public class Menu {

	public static String getOpcoes() {
		return getOpcaoNomeFuncionario() +
			getOpcaoCargoFuncionario() +
			getOpcaoSalarioFuncionario() +
			getOpcaoCalcularImposto() +
			getOpcaoSalarioLiquido() +
			getOpcaoMostrarFolha() +
			getOpcaoSair();
	}
	
	private static String getOpcaoSair() {
		return "S - Sair";
	}

	private static String getOpcaoMostrarFolha() {
		return "6 - Mostrar folha de pagamento\n";
	}

	private static String getOpcaoSalarioLiquido() {
		return "5 - Calcular salario liquido\n";
	}

	private static String getOpcaoCalcularImposto() {
		return "4 - Informar Imposto\n";
	}

	private static String getOpcaoSalarioFuncionario() {
		return "3 - Informar salario bruto\n";
	}

	private static String getOpcaoCargoFuncionario() {
		return "2 - Informar cargo\n";
	}

	private static String getOpcaoNomeFuncionario() {
		return "1 - Informar o nome\n";
		
	}

}
