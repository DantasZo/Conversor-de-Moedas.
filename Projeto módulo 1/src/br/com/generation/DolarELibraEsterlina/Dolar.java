package br.com.generation.DolarELibraEsterlina;

public class Dolar {

	private double libUK, dolCAN, eurGER, rubRUS, ienJAP, remCHI, pesARG, pesCOL, reaBR;

	public Dolar() {
		
		super();

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
		return + eurGER;
	}
	public double getLibra() {
		return + libUK;
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
