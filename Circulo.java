package classes;

public class Circulo {
	//q) Crie uma classe Circulo.

	//Crie o m�todo calcularArea() - f�rmula A <-- 3.14* R 2 .
	//O programa deve solicitar a entrada do valor do raio da circunfer�ncia.
	//Crie uma classe para testa a classe Circulo.
	 
	//Atributos
	
	 public float raio;
	 public float area;
	
	 //construtor
	 public Circulo(float raio) {
		super();
		this.raio = raio;
	}
	
	 //Metodos
	 
	 public void Raio() {
		 
		 this.area = (float) (3.14 * (this.raio * this.raio));
		
	}
	public String mostrarDados(){
		
		return "A area deste circulo � : " + this.area;
		
	}
	 
	
}
