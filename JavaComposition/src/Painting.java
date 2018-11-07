
public class Painting {
	private paintingMedium myMedium;
	private Canvas myCanvas;
	private String nameOfPainting;
	private int perFinished;
	private String Genre;
	private boolean isFramed;
	public Painting(paintingMedium myMedium,Canvas myCanvas,String nameOfPainting,int perFinished, String Genre,boolean isFramed) {
		this.myMedium=myMedium;
		this.Genre=Genre;
		this.myCanvas=myCanvas;
		this.nameOfPainting=nameOfPainting;
		this.perFinished=perFinished;
		this.isFramed=isFramed;
}
	public paintingMedium myMedium() {
		return this.myMedium;
	}
	public Canvas myCanvas() {
		return this.myCanvas;
	}
	public void paintingDescription() {
		System.out.println("Painting Name: "+nameOfPainting);
		System.out.println("Medium Used: "+myMedium.medium());
		System.out.println("Canvas Size: "+myCanvas.length()+"inch X "+myCanvas.width()+"inch");
		System.out.println("Canvas Type: "+myCanvas.type());
		System.out.println("% of Painting Done: "+perFinished+"%");
	}
  	
}
