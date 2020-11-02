public class DriverCircle {
	public static void main(String[] args) {
		Circle bulat = new Circle();	//instantiate object
		Circle bulat1 = new Circle(5);	//instantiate object
		Circle bulat2 = new Circle(8, "DITP3113");	//instantiate object

		String s = "DITP3113";
		System.out.println(s);

		System.out.println(bulat); //call method toString

		// System.out.println("Jejari bulat1 = " + bulat1.getJejari());
		// System.out.println("Jejari bulat = " + bulat.getJejari());

		// bulat2.setJejari(35);
		// System.out.println("Jejari bulat2 = " + bulat2.getJejari());

		// bulat2.setJejari(7);
		// System.out.println("Jejari bulat2 = " + bulat2.getJejari());

		// bulat2.setJejari(50);
		// System.out.println("Jejari bulat2 = " + bulat2.getJejari());
		//System.out.println("Luas ialah " + bulat.KiraLuas());
		//System.out.format("Luas ialah %2.2f" , bulat.KiraLuas());
		//System.out.printf("Luas ialah %2.2f" , bulat.KiraLuas());


	}
}