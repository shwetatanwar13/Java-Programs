package myRoom;

public class Window {
	 private Dimension winDimension;
	 private String material;
	 private String opensInOut;
	 private String Style;
	 
	public Window(Dimension winDimension, String material, String opensInOut, String style) {
		this.winDimension = winDimension;
		this.material = material;
		this.opensInOut = opensInOut;
		Style = style;
	}
	public Dimension getWinDimension() {
		return winDimension;
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
