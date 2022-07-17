package br.com.generation.conversorMoedas;

public class ConversorDolar {

	private double libUK, dolCAN, eurGER, rubRUS, ienJAP, remCHI, pesARG, pesCOL, reaBR;

	public ConversorDolar() {
		reaBR = 5.42; 
		ienJAP = 138.92; 
		libUK = 0.85;
		dolCAN = 1.31;
		eurGER = 1.00;
		rubRUS = 58.28;
		remCHI = 6.76;
		pesARG = 128.01;
		pesCOL = 4427.52;
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
	public double getDolCan() {
		return dolCAN;
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
