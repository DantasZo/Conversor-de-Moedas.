package br.com.generation.conversorMoedas;
public class ConversorPesoArg {

	private double dolUSA, libUK, dolCAN, eurGER, rubRUS, ienJAP, remCHI, reaBR, PesoCol;

	public ConversorPesoArg() {
		dolUSA = 0.0078;
		libUK = 0.0066;
		dolCAN = 0.010;
		eurGER = 0.0077 ;
		rubRUS = 0.46;
		ienJAP = 1.08;
		remCHI = 0.053;
		reaBR = 0.042;
		PesoCol = 34.30;
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
	
	public double getReal() {
          return reaBR;
	}
	
	public double getPesCol() {
		return PesoCol;
	}

}