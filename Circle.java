public class Circle {
	private double jejari = 1;

	//overloading method toString
	public String toString(){
		return "Jejari = " + jejari + "\nLuas adalah " + KiraLuas();
	}

	public void setJejari(double jejari){
		this.jejari = jejari;
	}

	public double getJejari(){
		return jejari;
	}

	//default constructor
	public Circle() {
		//System.out.println("Call Default constructor");
	}


	//overloading constructor - kena ada parameter
	public Circle(double r) {
		jejari = r;
		//System.out.println("Jejari = " + jejari);
	}

	public Circle(double r, String s) {
		jejari = r;
		System.out.println("Jejari = " + jejari + " String = " + s);
	}

	//method
	public double KiraLuas() {
		return jejari * jejari * Math.PI;
	}
}