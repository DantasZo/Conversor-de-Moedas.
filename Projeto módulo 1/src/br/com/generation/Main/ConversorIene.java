package br.com.generation.Main;

public class ConversorIene {
	private double Euro,Real, LibEst,Rublo, Dolar, Remimbi, PesoArg;

	public ConversorIene(){
		
		Real = 0.039;
		Euro = 0.0072;
		LibEst = 0.0061;
		Rublo = 0.43 ;
		Dolar = 0.0073;
		Remimbi = 0.049 ;
		PesoArg = 0.93;
		
		
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
	
	public double getDolar() {
		return Dolar;
	}
	
	public double getRemimbi() {
		return Remimbi;
	}
	
	public double getPesoArg() {
		return PesoArg;
	}

}
