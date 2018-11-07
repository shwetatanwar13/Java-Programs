package myRoom;

public class Bed {
 private Dimension bedDimension;
 private String type;
 private String bedMaterial;
 private Mattress myMattress;
 
public Bed(Dimension bedDimension, String type, String bedMaterial, Mattress myMattress) {
	this.bedDimension = bedDimension;
	this.type = type;
	this.bedMaterial = bedMaterial;
	this.myMattress = myMattress;
}
public Dimension getBedDimension() {
	return bedDimension;
}
public String getType() {
	return type;
}
public String getBedMaterial() {
	return bedMaterial;
}
public Mattress getMyMattress() {
	return myMattress;
}
 
}
