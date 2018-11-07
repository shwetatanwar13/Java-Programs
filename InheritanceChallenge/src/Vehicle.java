
public class Vehicle {
 private double speed;
 private int noOfTyres;
 private int Gear;
 private String Steer;
 public Vehicle(double speed,int noOfTyres,int Gear,String Steer) {
	 this.speed=speed;
	 this.noOfTyres=noOfTyres;
	 this.Gear=Gear;
	 this.Steer=Steer;
 }
  public void increaseSpeed(int a) {
	  speed+=a;
	  System.out.println("Now vehicle is moving at:"+speed);
  }
  public void decreaseSpeed(int a) {
	  speed-=a;
	  System.out.println("Now vehicle is moving at:"+speed);
  }
  public void changeGear(int Gear) {
	  this.Gear=Gear;
	  System.out.println("Now vehicle is moving at gear:"+Gear);
  }
  public void changeSteer(String Steer) {
	  this.Steer=Steer;
	  System.out.println("Now vehicle is going in direction:"+Steer);
  }
  public double speed() {
	  return this.speed;
	  }
  public int noOfTyres() {
	  return this.noOfTyres;
	  }
  public int Gear() {
	  return this.Gear;
	  }
  public String Steer() {
	  return this.Steer;
	  }
}
