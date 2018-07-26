package datosPersonajes;

import decorador.Trabajador;
import objetos.Armadura;
import objetos.Escudo;
import objetos.Espada;

public class DatosTrabajador {

	public void datosTrabajador() {

		Trabajador trabajador = new Trabajador();

		Espada espadaTrabajador = new Espada(trabajador);
		Armadura armaduraTrabajador = new Armadura(trabajador);
		Escudo escudoTrabajador = new Escudo(trabajador);

		System.out.println("Trabajador:");
		System.out.println();
		
		System.out.println("Salud:");
		System.out.println();
		System.out.println(" Vida: " + trabajador.vida()
				+ ", de ataque: " + trabajador.ataque() + " Defensa: " + trabajador.defensa() + " Magia: "
				+ trabajador.magia());
		System.out.println();

		System.out.println("Arma:");
		System.out.println();
		System.out.println(" Vida: "
				+ espadaTrabajador.vida() + " Ataque: " + espadaTrabajador.ataque() + " Defensa: "
				+ espadaTrabajador.defensa() + " Magia: " + espadaTrabajador.magia());
		System.out.println();
		
		System.out.println("Armadura:");
		System.out.println();
		System.out.println(" Vida: "
				+ armaduraTrabajador.vida() + " Ataque: " + armaduraTrabajador.ataque() + " Defensa: "
				+ armaduraTrabajador.defensa() + " Magia: " + armaduraTrabajador.magia());
		System.out.println();
		
		System.out.println("Escudo:");
		System.out.println();
		System.out.println(" Vida: "
				+ escudoTrabajador.vida() + " Ataque: " + escudoTrabajador.ataque() + " Defensa: "
				+ escudoTrabajador.defensa() + " Magia: " + escudoTrabajador.magia());

	}

}
