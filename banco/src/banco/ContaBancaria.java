package banco;

import java.text.NumberFormat;

public class ContaBancaria {
	private String cliente;
	private int numero;
	private double saldo;
	private boolean especial;
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String n) {
		cliente = n;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int num) {
		numero=num;
	}
	
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean b) {
		especial = b;
	}
	
	
	public void extrato() {
		System.out.println("Nome cliente: " + cliente);
		System.out.println("Numero conta: " + numero);
		System.out.println("Saldo: " + NumberFormat.getCurrencyInstance().format(saldo));
		System.out.println("Especial: " + especial);
	}
	
	public void deposito(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		} else {
			System.out.println("O valor para deposito é invalido");
		}
	}
	
	public void saque(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
		} else if (especial && valor <= saldo + 1000){
				saldo = saldo - valor;
		} else {
				System.out.println("O valor para saque é invalido");
		}
	}
	
	
	
	
	
	
	
	
}
