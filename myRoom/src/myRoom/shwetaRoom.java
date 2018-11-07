package myRoom;

public class shwetaRoom {
 Dimension roomDimension = new Dimension(20,20);
 Dimension mattressDimension = new Dimension(8,6);
 Dimension doorDimension= new Dimension(6,4);
 Dimension bedDimension= new Dimension(8,6);
 Dimension winDimension= new Dimension(8,6);
 Dimension wrbDimension = new Dimension(6,5);
 Mattress shMattress=new Mattress(mattressDimension,"SleepWell", "Cotton+Nylon",1);
 Bed shBed=new Bed(bedDimension,"Queen","Wooden",shMattress);
 Door mainDoor=new Door(doorDimension,"Wood","Out","Simple");
 Wardrobe shWardrobe=new Wardrobe(wrbDimension,"Coscto","Wooden",4,"Brown");
 Window shWindow=new Window(winDimension,"Wood","Out","Simple");
 Decorations wallClock=new Decorations("Wall Clock","Round","Above Window","Plastic Round Wall CLock with white backgroung and black hands");
 
}
