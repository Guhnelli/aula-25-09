package Aula_25_09;

public class Automovel extends Veiculo{

	private String n_portas;
	private String motor;
	
	public Automovel (String marca, String modelo, String cor, int ano, String n_portas, String motor) {
		super (marca, modelo, cor, ano); 
		this.n_portas = n_portas;
		this.motor = motor;
	}
	public String getN_portas() {
		return n_portas;
	}
	public void setN_portas (String n_portas) {
		this.n_portas = n_portas;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor (String motor) {
		this.motor = motor;
	}
}


