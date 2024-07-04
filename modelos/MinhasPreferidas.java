package modelos;

import interfaces.Audio;

public class MinhasPreferidas {
	public void incluir(Audio audio) {
		if (audio.getClassificacao() >= 9) {
			System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
		} else {
			System.out.println(audio.getTitulo() + " é um dos que todo mundo está curtindo!");
		}
	}

}
