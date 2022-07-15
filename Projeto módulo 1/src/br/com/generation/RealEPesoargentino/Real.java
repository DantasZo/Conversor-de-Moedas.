package br.com.generation.RealEPesoargentino;
public class Real {

	private double dolUSA, libUK, dolCAN, eurGER, rubRUS, ienJAP, remCHI, pesARG;

	public Real() {

		super();

		dolUSA = 0.19;
		libUK = 0.16;
		dolCAN = 0.24;
		eurGER = 0.18;
		rubRUS = 10.76;
		ienJAP = 25.61;
		remCHI = 1.25;
		pesARG = 23.83;
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
	public double getdolUSA() {
		return + dolUSA;
	}
	public double getienJAP() {
        return + ienJAP;
	}
	public double getdoremCHIA() {
         return + remCHI;
	}
	public double getpesARG() {
          return + pesARG;
	}

}