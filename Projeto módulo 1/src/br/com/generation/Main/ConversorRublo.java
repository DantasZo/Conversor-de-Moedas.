package br.com.generation.Main;

public class ConversorRublo {
	private double Euro,Real, LibEst,Dolar, Iene, Remimbi, PesoArg;
	
	

	public ConversorRublo() {
		super();
		Euro = 0.017;
		Real = 0.092;
		LibEst = 0.014;
		Dolar = 0.017;
		Iene = 2.35;
		Remimbi = 0.11;
		PesoArg = 2.19;
	}

	public double getEuro() {
		return Euro;
	}


	public double getReal() {
		return Real;
	}


	public double getLibra() {
		return LibEst;
	}


	public double getDolar() {
		return Dolar;
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
