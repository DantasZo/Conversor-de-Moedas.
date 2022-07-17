package br.com.generation.conversorMoedas;

public class ConversorRenminbi {

	private double dolUSA, libUK, dolCAN, eurGER, rubRUS, realBR, ienJAP,pesARG, pesCOP;

	public ConversorRenminbi() {
		dolUSA = 0.148;
		libUK = 0.1248;
		dolCAN = 0.1931;
		eurGER = 0.1467;
		rubRUS = 9.0098;
		realBR = 0.7991;
		ienJAP = 0.7991;
		pesARG = 18.9817;
		pesCOP = 651.1789;
	}

	public double getDolar() {
		return dolUSA;
	}

	public double getLibra() {
		return libUK;
	}

	public double getDolCan() {
		return dolCAN;
	}

	public double getEuro() {
		return eurGER;
	}

	public double getRublo() {
		return rubRUS;
	}

	public double getReal() {
		return realBR;
	}

	public double getIene() {
		return ienJAP;
	}

	public double getPesoArg() {
		return pesARG;
	}

	public double getPesoCol() {
		return pesCOP;
	}


}
