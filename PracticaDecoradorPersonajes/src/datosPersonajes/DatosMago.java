package datosPersonajes;

import decorador.Mago;
import objetos.Amuleto;
import objetos.Armadura;
import objetos.Escudo;
import objetos.Espada;

public class DatosMago {

	public void datosMago() {
		Mago mago = new Mago();

		Espada espadaMago = new Espada(mago);
		Armadura armaduraMago = new Armadura(mago);
		Escudo escudoMago = new Escudo(mago);
		Amuleto amuletoMago = new Amuleto(mago);

		System.out.println("Mago:");
		System.out.println();

		System.out.println("Salud:");
		System.out.println();
		System.out.println(" Vida: " + mago.vida()
				+ " Ataque: " + mago.ataque() + " Defensa: " + mago.defensa()
				+ " Magia: " + mago.magia());
		System.out.println();

		System.out.println("Arma:");
		System.out.println();
		System.out.println( " Vida: " + espadaMago.vida()
				+ " Ataque: " + espadaMago.ataque() + " Defensa: " + espadaMago.defensa()
				+ " Magia: " + espadaMago.magia());
		System.out.println();

		System.out.println("Armadura:");
		System.out.println();
		System.out.println( " Vida: "
				+ armaduraMago.vida() + " Ataque: " + armaduraMago.ataque() + " Defensa: "
				+ armaduraMago.defensa() + " Magia: " + armaduraMago.magia());
		System.out.println();

		System.out.println("Escudo:");
		System.out.println();
		System.out.println(" Vida: " + escudoMago.vida()
				+ " Ataque: " + escudoMago.ataque() + " Defensa: " + escudoMago.defensa()
				+ " Magia: " + escudoMago.magia());
		System.out.println();

		System.out.println("Amuleto:");
		System.out.println();
		System.out.println(" Vida: " + amuletoMago.vida()
				+ " Ataque: " + amuletoMago.ataque() + " Defensa: " + amuletoMago.defensa()
				+ " Magia: " + amuletoMago.magia());
		
		System.out.println();
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");

	}
}
