package model;

public class Curso {
	
	//Variaveis
	private String idCurso;
	private String nomeCurso;
	private String areaCurso;
	
	//Construtores
	public Curso() {
		super();
	}
	
	public Curso(String idCurso, String nomeCurso, String areaCurso) {
		this.idCurso = idCurso;
		this.nomeCurso = nomeCurso;
		this.areaCurso = areaCurso;
	}
	
	//Getters e Setters
	public String getIdCurso() {
		return idCurso;
	}
	
	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public String getAreaCurso() {
		return areaCurso;
	}
	
	public void setAreaCurso(String areaCurso) {
		this.areaCurso = areaCurso;
	}
	
	//toString
	@Override
	public String toString() {
		return idCurso + "; " + nomeCurso + "; " + areaCurso;
	}
	
}