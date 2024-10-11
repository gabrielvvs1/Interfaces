package br.com.transporte.impl;

import br.com.transporte.Transporte;

public class Carro extends Automovel implements Transporte{
	
	public Carro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("O carro esta se movendo pelas estradas.");
		
	}

}
