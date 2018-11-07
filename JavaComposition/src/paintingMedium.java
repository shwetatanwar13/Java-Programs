
public class paintingMedium {
  private String medium;
  private int viscosityLevel;
  private float pricePerBottle;
  private int noOfBottles;
  public paintingMedium(String medium,int viscosityLevel,float pricePerBottle,int noOfBottles) {
	  this.noOfBottles=noOfBottles;
	  this.medium=medium;
	  this.viscosityLevel=viscosityLevel;
	  this.pricePerBottle=pricePerBottle;
	  }
  public String medium() {
	  return this.medium;
  }
  public int viscosityLevel() {
	  return this.viscosityLevel;
  }
  public float pricePerBottle() {
	  return this.pricePerBottle;
  }
  public int noOfBottles() {
	  return this.noOfBottles;
  }
}
