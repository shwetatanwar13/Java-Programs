
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canvas myCanvas=new Canvas("Stretched", 10, 20,true);
		paintingMedium myMedium=new paintingMedium("Linseed Oil",4,12,2);
		Painting one=new Painting(myMedium,myCanvas,"Glory of Summer",24,"Scenic",true);
		one.paintingDescription();
		System.out.println("Is it primered : "+one.myCanvas().isPrimered());
		
	}

}
