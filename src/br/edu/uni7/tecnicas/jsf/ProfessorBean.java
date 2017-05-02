package br.edu.uni7.tecnicas.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProfessorBean {
	private Professor professor = new Professor();
	private AreaDeInteresse areaDeInteresse = new AreaDeInteresse();
	private List<Professor> professores = new ArrayList<Professor>();

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public AreaDeInteresse getAreaDeInteresse() {
		return areaDeInteresse;
	}

	public void setAreaDeInteresse(AreaDeInteresse areaDeInteresse) {
		this.areaDeInteresse = areaDeInteresse;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public void adicionarArea() {
		professor.adicionarAreaDeInteresse(areaDeInteresse);
		areaDeInteresse = new AreaDeInteresse();
	}

	public String adicionarProfessor() {
		String nextStep = "professores";
		professores.add(professor);
		professor = new Professor();

		return nextStep;
	}
}
