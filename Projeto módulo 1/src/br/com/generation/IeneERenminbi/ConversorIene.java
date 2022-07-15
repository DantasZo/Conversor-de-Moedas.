package br.com.generation.IeneERenminbi;

public class ConversorIene {
	
	private double dolEUA;
	private double realBR;
	private double reminbi;
	private double libraE;
	private double dolCAD;
	private double euro;
	private double rublo;
	private double pesoAr;
	
	
	public ConversorIene() {
		super();
		dolEUA = 0.0073;
		realBR = 5.42;
		reminbi = 0.0486;
		libraE = 0.0061;
		dolCAD = 0.0094;
		euro = 0.0072;
		rublo = 0.4196;
		pesoAr = 0.9215;
	}
	public double getDolEUA() {
		return dolEUA;
	}
	public void setDolEUA(double dolEUA) {
		this.dolEUA = dolEUA;
	}
	public double getRealBR() {
		return realBR;
	}
	public void setRealBR(double realBR) {
		this.realBR = realBR;
	}
	public double getReminbi() {
		return reminbi;
	}
	public void setReminbi(double reminbi) {
		this.reminbi = reminbi;
	}
	public double getLibraE() {
		return libraE;
	}
	public void setLibraE(double libraE) {
		this.libraE = libraE;
	}
	public double getDolCAD() {
		return dolCAD;
	}
	public void setDolCAD(double dolCAD) {
		this.dolCAD = dolCAD;
	}
	public double getEuro() {
		return euro;
	}
	public void setEuro(double euro) {
		this.euro = euro;
	}
	public double getRublo() {
		return rublo;
	}
	public void setRublo(double rublo) {
		this.rublo = rublo;
	}
	public double getPesoAr() {
		return pesoAr;
	}
	public void setPesoAr(double pesoAr) {
		this.pesoAr = pesoAr;
	}
	
	

}
