package br.com.generation.conversorMoedas;

public class ConversorPesoCol {
	private double libUK, dolUSA, eurGER, rubRUS, ienJAP, remCHI, pesARG, DolCan, reaBR;

	public ConversorPesoCol() {
		reaBR = 0.0012; 
		ienJAP = 0.031; 
		libUK = 0.00019;
		dolUSA = 0.00022;
		eurGER = 0.00022;
		rubRUS = 0.013;
		remCHI = 0.0015;
		pesARG = 0.029;
		DolCan = 0.00029;
	}
	
	public double getEuro() {
		return eurGER;
	}
	public double getLibra() {
		return libUK;
	}
	public double getRublo() {
		return rubRUS;
	}
	public double getDolar() {
		return dolUSA;
	}
	public double getReal() {
		return reaBR;
	}
	public double getIene() {
        return ienJAP;
	}
	public double getRemimbi() {
         return remCHI;
	}
	public double getPesArg() {
          return pesARG;
	}
	public double getDolCan() {
		return DolCan;
	}


}
