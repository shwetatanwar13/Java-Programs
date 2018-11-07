
public class Canvas {
	 private String type;
	 private int length;
	 private int width;
	 private boolean isPrimered;
	 public Canvas(String type, int length, int width,boolean isPrimered) {
		 this.type=type;
		 this.length=length; 
		 this.width=width;
		 this.isPrimered=isPrimered;
	 }
	 public String type() {
		  return this.type;
	  }
	  public int length() {
		  return this.length;
	  }
	  public int width() {
		  return this.width;
	  }
	  public boolean isPrimered() {
		  return this.isPrimered;
	  }
	  
}
