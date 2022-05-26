package Modelo;

public class Disciplina {
	
	private String nome;
	private String ementa;
	private String cargaHorario;
	private String codigo;
	public Disciplina(String nome, String ementa, String cargaHorario, String codigo) {
		
		this.nome = nome;
		this.ementa = ementa;
		this.cargaHorario = cargaHorario;
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public String getCargaHorario() {
		return cargaHorario;
	}
	public void setCargaHorario(String cargaHorario) {
		this.cargaHorario = cargaHorario;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
