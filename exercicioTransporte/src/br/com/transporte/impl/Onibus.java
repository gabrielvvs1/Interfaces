package br.com.transporte.impl;

import br.com.transporte.Transporte;

public class Onibus extends Automovel implements Transporte{

	public Onibus(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("O onibus esta se movendo pela rota urbana.");
	}
	
	

}
