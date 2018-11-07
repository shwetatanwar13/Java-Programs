package carPolymorphism;

class Car{
	private boolean engine;
	private int cylinders;
	private int wheels;
	private int seater;
	private String name;
	private int speed;
	public Car( int cylinders, int seater, String name) {
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.seater = seater;
		this.name = name;
		this.speed=0;
	}
	public boolean getEngines() {
		return engine;
	}
	public int getCylinders() {
		return cylinders;
	}
	public int getWheels() {
		return wheels;
	}
	public int getSeater() {
		return seater;
	}
	public String getName() {
		return name;
	}
	public void accelerate(int a) {
		this.speed+=a;
	}
	public void startEngine() {
		engine=true;
	}
	public void brake() {
		engine=false;
		speed=0;
	}
	
	
}
class Mercedes extends Car{
	private boolean bluethooth;
	private String model;
	private int gear;
	
	public Mercedes(int cylinders, int seater, String name, boolean bluethooth, String model) {
		super(cylinders, seater, name);
		this.bluethooth = bluethooth;
		this.model = model;
		this.gear = 0;
	}
	public boolean isBluethooth() {
		return bluethooth;
	}
	public String getModel() {
		return model;
	}
	public int getGear() {
		return gear;
	}
	@Override
	public void accelerate(int a) {
		super.accelerate(a);
		this.gear=2;
		System.out.println("Accelerating your Mercedes");
	}
	@Override
	public void startEngine() {
		super.startEngine();
		this.gear=1;
		System.out.println("Staring your Mercedes");
	}
	@Override
	public void brake() {
		super.brake();
		this.gear=0;
		System.out.println("Stopping your Mercedes");
	}
	
}
class Jeep extends Car{
	private boolean bluethooth;
	private String model;
	private int gear;
	
	public Jeep(int cylinders, int seater, String name, boolean bluethooth, String model) {
		super(cylinders, seater, name);
		this.bluethooth = bluethooth;
		this.model = model;
		this.gear = 0;
	}
	public boolean isBluethooth() {
		return bluethooth;
	}
	public String getModel() {
		return model;
	}
	public int getGear() {
		return gear;
	}
	@Override
	public void accelerate(int a) {
		super.accelerate(a);
		this.gear=2;
		System.out.println("Accelerating your Jeep");
	}
	@Override
	public void startEngine() {
		super.startEngine();
		this.gear=1;
		System.out.println("Staring your Jeep");
	}
	@Override
	public void brake() {
		super.brake();
		this.gear=0;
		System.out.println("Stopping your Jeep");
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car car1=random_ret();
    car1.accelerate(20);
	}
	public static Car random_ret() {
		int a;
	    a=(int)(Math.random()*2);
	    System.out.println("Random number is: "+a);
	    switch(a) {
	    case 0:
	    	return new Mercedes(4,4,"mercedes", true, "V2V");
	    case 1:
	    	return new Jeep(4,4,"jeep", true, "V2V");
	    }
	    return null;
	}
	

}
