package br.com.generation.conversorMoedas;

public class ConversorLibra {
	private double dolUSA, dolCAN, eurGER, rubRUS, ienJAP, remCHI, pesARG, pesCOL, reaBR;

	public ConversorLibra() {
		reaBR = 6.39; 
		ienJAP = 164.24; 
		dolUSA = 1.19;
		dolCAN = 1.55;
		eurGER = 1.18;
		rubRUS = 69.19;
		remCHI = 8.01;
		pesARG = 152.00;
		pesCOL = 5238.61;
		
	}
	
	public double getEuro() {
		return eurGER;
	}
	
	public double getDolar() {
		return dolUSA;
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
