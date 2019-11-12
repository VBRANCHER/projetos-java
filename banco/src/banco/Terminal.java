package banco;
import javax.swing.JOptionPane;
public class Terminal {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		String cliente = JOptionPane.showInputDialog("Digite o nome");
		conta.setCliente(cliente);
		String numero = JOptionPane.showInputDialog("Digite o numero da conta");
		conta.setNumero(Integer.parseInt(numero));
		while(true) {
			String acao = JOptionPane.showInputDialog("Digite: \n" +
					"1-deposito\n"+
					"2-saque\n"+
					"3-extrato\n"+
					"4-contrate conta especial\n"+
					"5-sair");
			if (acao.equals("1")) {
				String resp = JOptionPane.showInputDialog("Digite o valor para deposito");
				conta.deposito(Double.parseDouble(resp));
			} else if (acao.equals("2")) {
				String resp = JOptionPane.showInputDialog("Digite o valor para saque");
				conta.saque(Double.parseDouble(resp));
			} else if (acao.equals("3")) {
				conta.extrato();
			} else if (acao.equals("4")) {
				conta.setEspecial(!conta.isEspecial());
			} else if (acao.equals("5")) {
				System.exit(0);
			}
		}
	}
}
