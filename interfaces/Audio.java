package interfaces;

public class Audio {
	private String titulo;
	private int duracao;
	private int totalReproducoes;
	private int curtidas;
	private int classificacao;

	public void curtir() {
		this.curtidas++;
	}

	public void reproduzir() {
		this.totalReproducoes++;
	}

	// getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
}
