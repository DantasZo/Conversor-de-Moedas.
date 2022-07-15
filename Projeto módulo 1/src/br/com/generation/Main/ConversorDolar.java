package br.com.generation.Main;

public class ConversorDolar {
	private double Euro,Real, LibEst,Rublo, Iene, Remimbi, PesoArg;


	public ConversorDolar()
	{
		Real = 5.38;
		Euro = 0.99;
		LibEst = 0.89;
		Rublo = 58.48;
		Iene = 137.39;
		Remimbi = 6.72;
		PesoArg = 137.83;
		
		
	}

	public double getReal() {
		return Real;
	}
		
	public double getEuro() {
			return Euro;
	}
	
	public double getLibra() {
		return LibEst;
	}
	
	public double getRublo() {
		return Rublo;
	}
	
	public double getIene() {
		return Iene;
	}
	
	public double getRemimbi() {
		return Remimbi;
	}
	
	public double getPesoArg() {
		return PesoArg;
	}
}
