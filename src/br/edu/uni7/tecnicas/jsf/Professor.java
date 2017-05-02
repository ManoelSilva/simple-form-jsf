package br.edu.uni7.tecnicas.jsf;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	public static enum Titulacao {
		Graduado, Especialista, Mestre, Doutor
	}

	private static Integer contador = 0;
	private Integer id;
	private String nome;
	private Titulacao titulo;
	private List<AreaDeInteresse> areaDeInteresse = new ArrayList<AreaDeInteresse>();

	public Professor() {
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

	public Titulacao getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulacao titulo) {
		this.titulo = titulo;
	}

	public List<AreaDeInteresse> getAreaDeInteresse() {
		return areaDeInteresse;
	}

	public void setAreaDeInteresse(List<AreaDeInteresse> areaDeInteresse) {
		this.areaDeInteresse = areaDeInteresse;
	}
	
	public void adicionarAreaDeInteresse(AreaDeInteresse area){
		areaDeInteresse.add(area);
	}

}
