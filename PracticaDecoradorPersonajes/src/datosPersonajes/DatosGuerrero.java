package datosPersonajes;

import decorador.Guerrero;
import objetos.Amuleto;
import objetos.Armadura;
import objetos.Escudo;
import objetos.Espada;

public class DatosGuerrero {

	public void datosGuerrero() {

		Guerrero guerrero = new Guerrero();

		Espada espadaGuerrero = new Espada(guerrero);
		Armadura armaduraGuerrero = new Armadura(guerrero);
		Escudo escudoGuerrero = new Escudo(guerrero);
		Amuleto amuletoGuerrero = new Amuleto(guerrero);

		System.out.println("Guerrero:");
		System.out.println();

		System.out.println("Salud:");
		System.out.println();
		System.out.println(" Vida: " + guerrero.vida()
				+ " Ataque: " + guerrero.ataque() + " Defensa: " + guerrero.defensa()
				+ " Magia: " + guerrero.magia());
		System.out.println();

		System.out.println("Arma:");
		System.out.println();
		System.out.println( " Vida: " + espadaGuerrero.vida()
				+ " Ataque: " + espadaGuerrero.ataque() + " Defensa: " + espadaGuerrero.defensa()
				+ " Magia: " + espadaGuerrero.magia());
		System.out.println();

		System.out.println("Armadura:");
		System.out.println();
		System.out.println( " Vida: "
				+ armaduraGuerrero.vida() + " Ataque: " + armaduraGuerrero.ataque() + " Defensa: "
				+ armaduraGuerrero.defensa() + " Magia: " + armaduraGuerrero.magia());
		System.out.println();

		System.out.println("Escudo:");
		System.out.println();
		System.out.println(" Vida: " + escudoGuerrero.vida()
				+ " Ataque: " + escudoGuerrero.ataque() + " Defensa: " + escudoGuerrero.defensa()
				+ " Magia: " + escudoGuerrero.magia());
		System.out.println();

		System.out.println("Amuleto:");
		System.out.println();
		System.out.println(" Vida: " + amuletoGuerrero.vida()
				+ " Ataque: " + amuletoGuerrero.ataque() + " Defensa: " + amuletoGuerrero.defensa()
				+ " Magia: " + amuletoGuerrero.magia());

		System.out.println();
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");

	}

}
