package avaliacao;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		FolhaDePagamento folha = new FolhaDePagamento();
		folha.getnome("Vinicius");
		folha.getcargo("TI");
		folha.getsalarioBruto("1500");
		folha.getimposto("100");
		folha.getsalarioLiquido("2000");
		while (true) {
			
			
			String acao = JOptionPane.showInputDialog(Menu.getOpcoes());
			/*
			 * Complete o codigo para tratar cada opcao do menu
			 */
			
			if (acao.equals("1")) {
			
			}
			
			if (acao.equals("2")) {
				
			}
			
			if (acao.equals("3")) {
				
			}
			
			if(acao.equals("4")) {
				
			}
			
			if(acao.equals("5")) {
				
			}
			
			if (acao.equals("6")) {
				
			}
			if (acao.equals("S")) {
				System.exit(0);
			}
		}
	}
}
