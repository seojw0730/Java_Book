package generics;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		powder.doPrinting();

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();

		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
		plastic.doPrinting();

//		GenericPrinter<Water> a = new GenericPrinter<Material>();
	}
}