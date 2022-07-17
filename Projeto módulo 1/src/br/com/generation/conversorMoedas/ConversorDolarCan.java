package br.com.generation.conversorMoedas;

public class ConversorDolarCan {
	private double libUK, dolUSA, eurGER, rubRUS, ienJAP, remCHI, pesARG, pesCOL, reaBR;

	public ConversorDolarCan() {
		reaBR = 4.15; 
		ienJAP = 106.29; 
		libUK = 0.65;
		dolUSA = 0.77;
		eurGER = 0.76;
		rubRUS = 43.74;
		remCHI = 5.19;
		pesARG = 98.53;
		pesCOL = 3379.10;
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
	public double getPesCol() {
		return pesCOL;
	}

}
