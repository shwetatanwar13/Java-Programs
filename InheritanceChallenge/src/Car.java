
public class Car extends Vehicle{
  private int seater;
  private String color;
  private int manufactureYear;
  private String fuel;
  public Car(int seater,String color,int manufactureYear,String fuel,double speed,int noOfTyres,int Gear,String Steer) {
	  super(speed, noOfTyres, Gear, Steer);
	  this.seater=seater;
	  this.color=color;
	  this.manufactureYear= manufactureYear;
	  this.fuel=fuel;
	  }
  public int seater() {
	  return this.seater;
	  }
  public String color() {
	  return this.color;
	  }
  public int manufactureYear() {
	  return this.manufactureYear;
	  }
  public String fuel() {
	  return this.fuel;
	  }
}
