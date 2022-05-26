package Modelo;

public class PeriodoLetivo {

	private String nome;
	private String dataInicio;
	private String dataFim;
	private String diasLetivos;
	public PeriodoLetivo(String nome, String dataInicio, String dataFim, String diasLetivos) {

		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.diasLetivos = diasLetivos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public String getDiasLetivos() {
		return diasLetivos;
	}
	public void setDiasLetivos(String diasLetivos) {
		this.diasLetivos = diasLetivos;
	}
	
}
