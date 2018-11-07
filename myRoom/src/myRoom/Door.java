package myRoom;

public class Door {
	 private Dimension doorDimension;
	 private String material;
	 private String opensInOut;
	 private String Style;
	 
	public Door(Dimension doorDimension, String material, String opensInOut, String style) {
		this.doorDimension = doorDimension;
		this.material = material;
		this.opensInOut = opensInOut;
		Style = style;
	}
	public Dimension getDoorDimension() {
		return doorDimension;
	}
	public String getMaterial() {
		return material;
	}
	public String getOpensInOut() {
		return opensInOut;
	}
	public String getStyle() {
		return Style;
	}
	 
}
