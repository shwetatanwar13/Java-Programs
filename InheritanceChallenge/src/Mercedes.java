
public class Mercedes extends Car{
 private String model;
 private boolean turnBluetooth;
 private boolean turnWifi;
 private boolean turnVoiceControl;
 public Mercedes(String model,boolean turnBluetooth,boolean turnWifi,boolean turnVoiceControl,int seater,String color,int manufactureYear,String fuel,double speed,int noOfTyres,int Gear,String Steer) {
	 super(seater,color,manufactureYear,fuel,speed,noOfTyres,Gear,Steer);
	 this.model=model;
	 this.turnBluetooth=turnBluetooth;
	 this.turnWifi=turnWifi;
	 this.turnVoiceControl=turnVoiceControl;
	 }
 public void describeMercedes()
 {
	 System.out.println("Your mercedes is model:"+model+" and color:"+super.color()+".The bluetooth is turned:"+turnBluetooth+
			 ".Wifi is turned:"+turnWifi+".Its running at speed:"+super.speed()+" and at gear:"+super.Gear()
			 );
 }
 
}
