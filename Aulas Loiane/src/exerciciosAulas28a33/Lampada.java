package exerciciosAulas28a33;

public class Lampada {
	private String modelo, tensao, cor, tipoLuz;
	private int potencia, garantiaMeses;
	private String [] tipos;
	private boolean ligada;
	
	public Lampada() {
		
	}
	
	public Lampada(String modelo, String tensao, String cor, String tipoLuz, int potencia, int garantiaMeses,
			String[] tipos, boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.potencia = potencia;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.ligada = ligada;
	}


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		setLigada(true);
	}
	
	public void desligar() {
		setLigada(false);
	}
	
	public void mostrarEstado() {
		if(isLigada()) {
			System.out.println("Lampada está ligada");
		}else {
			System.out.println("Lampada está desligada");
		}
	}
	
	public void mudarEstado() {
		if(isLigada()) {
			desligar();
		}else {
			ligar();
		}
	}
	
}
