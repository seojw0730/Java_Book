package generics;

public class ThreeDPrinter {
//	private Powder material;
//
//	public void setMaterial(Powder material) {
//		this.material = material;
//	}
//
//	public Powder getMaterial() {
//		return material;
//	}
//
//	private Plastic material;
//
//	public void setMaterial(Plastic material) {
//		this.material = material;
//	}
//
//	public Powder getMaterial() {
//		return material;
//	}

	private Object material;

	public void setMaterial(Object material) {
		this.material = material;
	}

	public Object getMaterial() {
		return material;
	}
	
	ThreeDPrinter printer = new ThreeDPrinter();
	
	Powder p1 = new Powder();
//	printer.setMaterial(p1);
	
	Powder p2 = (Powder)printer.getMaterial();
}
