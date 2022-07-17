package br.com.generation.conversorMoedas;

public class ConversorEuro {
	
private double Rublo,Real, LibEst,Dolar, Iene, Remimbi, PesoArg, PesoCol, DolCan;

	public ConversorEuro() {
		Rublo = 58.76;
		Real = 5.42;
		LibEst = 0.85;
		Dolar = 1;
		Iene = 138.13;
		Remimbi = 6.75;
		PesoArg = 128.42;
		PesoCol = 4439.37;
		DolCan = 1.31;
	}

	public double getRublo() {
		return Rublo;
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
	
	public double getPesCol() {
		return PesoCol;
	}
	
	public double getDolCan() {
		return DolCan;
	}

}
