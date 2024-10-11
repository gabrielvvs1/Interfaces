package br.com.transporte.impl;

import br.com.transporte.Transporte;

public class Bicicleta extends Automovel implements Transporte{

	public Bicicleta(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("A bicicleta esta sendo pedalada.");
	}
	


}
