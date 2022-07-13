package br.com.generation.Main;

public class ConstrutorConversao {
	private double Euro,Real, LibEst,Rublo;


	public ConstrutorConversao(double real)
	{
		Real = 5.38;
		Euro = 0.99;
		LibEst = 0.89;
		Rublo = 58.48;
		
	}

	public double getReal() {
		return + Real;
	}
		
	public double getEuro() {
			return + Euro;
	}
	
	public double getLibra() {
		return + LibEst;
	}
	
	public double getRublo() {
		return + Rublo;
	}
}
