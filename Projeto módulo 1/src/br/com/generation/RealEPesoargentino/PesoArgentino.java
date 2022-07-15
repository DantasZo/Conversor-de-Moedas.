package br.com.generation.RealEPesoargentino;
public class PesoArgentino {

	private double dolUSA, libUK, dolCAN, eurGER, rubRUS, ienJAP, remCHI, reaBR;

	public PesoArgentino() {

		super();

		dolUSA = 0.0078;
		libUK = 0.0066;
		dolCAN = 0.010;
		eurGER = 0.0077 ;
		rubRUS = 0.46;
		ienJAP = 1.08;
		remCHI = 0.053;
		reaBR = 0.042;
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
	public double getreaBR() {
          return + reaBR;
	}

}