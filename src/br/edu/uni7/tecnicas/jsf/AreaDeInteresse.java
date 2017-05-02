package br.edu.uni7.tecnicas.jsf;

public class AreaDeInteresse {
	private static Integer contador = 0;
	private Integer id;
	private String nome;

	public AreaDeInteresse() {
		id = ++contador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
