package br.com.generation.DolarELibraEsterlina;

public class LibraUK {
	private double dolUSA, dolCAN, eurGER, rubRUS, ienJAP, remCHI, pesARG, pesCOL, reaBR;

	public LibraUK() {
		
		super();

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
		return + eurGER;
	}
	public double getdolUSA() {
		return + dolUSA;
	}
	public double getRublo() {
		return + rubRUS;
	}
	public double getdolCAN() {
		return + dolCAN;
	}
	public double getreaBR() {
		return + reaBR;
	}
	public double getienJAP() {
        return + ienJAP;
	}
	public double getdoremCHI() {
         return + remCHI;
	}
	public double getpesARG() {
          return + pesARG;
	}
	public double getpesCOL() {
		return + pesCOL;
	}
}
