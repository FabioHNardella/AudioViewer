package main;

import modelos.Podcast;
import modelos.MinhasPreferidas;
import modelos.Musica;

public class Main {

	public static void main(String[] args) {
		Musica musica = new Musica();
		Podcast podcast = new Podcast();
		MinhasPreferidas preferidas = new MinhasPreferidas();

		musica.setTitulo("Forever");
		musica.setArtista("Kiss");
		podcast.setTitulo("BolhaDev");
		podcast.setHost("Marcus Mendes");

		for (int i = 0; i < 2000; i++) {
			musica.reproduzir();
		}

		for (int i = 0; i < 50; i++) {
			musica.curtir();
		}

		for (int i = 0; i < 1250; i++) {
			podcast.reproduzir();
		}

		for (int i = 0; i < 500; i++) {
			podcast.curtir();
		}

		preferidas.incluir(podcast);
		preferidas.incluir(musica);

	}

}
