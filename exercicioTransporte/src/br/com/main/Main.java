package br.com.main;
import br.com.transporte.impl.*;
import br.com.transporte.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transporte objcarro = new Carro("Subaru Impreza");
		Transporte objbbicicleta = new Bicicleta("Caloi");
		Transporte objonibus = new Onibus("Mercedez");
		
		objcarro.mover();
		objbbicicleta.mover();
		objonibus.mover();
		
		

	}

}
