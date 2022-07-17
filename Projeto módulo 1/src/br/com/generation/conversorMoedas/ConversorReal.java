package br.com.generation.conversorMoedas;
public class ConversorReal {

	private double dolUSA, libUK, dolCAN, eurGER, rubRUS, ienJAP, remCHI, pesARG, pesoCol;

	public ConversorReal() {
		dolUSA = 0.19;
		libUK = 0.16;
		dolCAN = 0.24;
		eurGER = 0.18;
		rubRUS = 10.76;
		ienJAP = 25.61;
		remCHI = 1.25;
		pesARG = 23.83;
		pesoCol = 814.35;
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
	
	public double getDolar() {
		return dolUSA;
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
        return pesoCol;
	}

}