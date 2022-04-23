package br.com.healthtrack;

/* A classe Treino armazena as informa��es da dura��o do treino, quantidade de exercicios, nome, repeti��o dos exercicios
 * e o nome */

public class Treino {
	private float duracao;
	private int quantExercicio;
	private String descricao;
	private String nomeTreino;
	private int repeticaoTreino;
	Exercicio exercicioUm = new Exercicio();
	Usuario usuarioUm = new Usuario ();
	
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	public int getQuantExercicio() {
		return quantExercicio;
	}
	public void setQuantExercicio(int quantExercicio) {
		this.quantExercicio = quantExercicio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNomeTreino() {
		return nomeTreino;
	}
	public void setNomeTreino(String nomeTreino) {
		this.nomeTreino = nomeTreino;
	}
	public int getRepeticaoTreino() {
		return repeticaoTreino;
	}
	public void setRepeticaoTreino(int repeticaoTreino) {
		this.repeticaoTreino = repeticaoTreino;
	}
	
	/* O met�do criarTreino() informa que o exercicio foi criado */
	
	public static void criarTreino () {
		System.out.println("Treino criado com sucesso!");
	}
	
}
