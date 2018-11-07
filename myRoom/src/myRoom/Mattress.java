package myRoom;

public class Mattress {
 private Dimension mattressDimension;
 private String brand;
 private String material;
 private int depth;
 
public Mattress(Dimension mattressDimension, String brand, String material, int depth) {
	this.mattressDimension = mattressDimension;
	this.brand = brand;
	this.material = material;
	this.depth = depth;
}
public Dimension getMattressDimension() {
	return mattressDimension;
}
public String getBrand() {
	return brand;
}
public String getMaterial() {
	return material;
}
public int getDepth() {
	return depth;
}
 
 }
