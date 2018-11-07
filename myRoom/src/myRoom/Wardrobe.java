package myRoom;

public class Wardrobe {
	 private Dimension wrbDimension;
	 private String brand;
	 private String material;
	 private int noOfShelves;
	 private String color;
	 
	public Wardrobe(Dimension wrbDimension, String brand, String material, int noOfShelves, String color) {
		this.wrbDimension = wrbDimension;
		this.brand = brand;
		this.material = material;
		this.noOfShelves = noOfShelves;
		this.color = color;
	}
	public Dimension getWrbDimension() {
		return wrbDimension;
	}
	public String getBrand() {
		return brand;
	}
	public String getMaterial() {
		return material;
	}
	public int getNoOfShelves() {
		return noOfShelves;
	}
	public String getColor() {
		return color;
	}
	 
}
