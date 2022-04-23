package br.com.healthtrack;

/* A classe Exercicio armazena o nome do exercicio, número do mesmo, tempo de duração, tipo de exercicio e o nome do video do exercicio
 */

public class Exercicio {
	private String nomeExercicio;
	private int nrExercicio;
	private float tempoDuracao;
	private String tipoExercicio;
	private String video;
	
	public String getNomeExercicio() {
		return nomeExercicio;
	}

	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}

	public int getNrExercicio() {
		return nrExercicio;
	}

	public void setNrExercicio(int nrExercicio) {
		this.nrExercicio = nrExercicio;
	}

	public float getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(float tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	public String getTipoExercicio() {
		return tipoExercicio;
	}

	public void setTipoExercicio(String tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
	
	/* O metódo criarExercicio informa que o exercicio foi criado
	 */

	public static void criarExercicio () {
		System.out.println("Exercicio criado com sucesso!");
	}
}
