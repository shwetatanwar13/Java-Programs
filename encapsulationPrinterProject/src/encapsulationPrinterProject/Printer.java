package encapsulationPrinterProject;

public class Printer {
 private int tonerLevel;
 private float noOfPages;
 private boolean isDuplex;
 
public Printer(int tonerLevel, int noOfPages, boolean isDuplex) {
	if (tonerLevel>=0 && tonerLevel <=100)
	{
	this.tonerLevel = tonerLevel;
	}
	this.noOfPages = noOfPages;
	this.isDuplex = isDuplex;
}
public int getTonerLevel() {
	return tonerLevel;
}
public float getNoOfPages() {
	return noOfPages;
}
public boolean isDuplex() {
	return isDuplex;
}
public void fillTonerLevel(int fill) {
	if (this.tonerLevel+fill<=100) {
		this.tonerLevel+=fill;
		System.out.println("Toner level noe is: "+this.tonerLevel);
	}
	else
	{
		System.out.println("Level more than 100%....");
	}
}

public void printPage() {
	if (this.tonerLevel==0) {
		System.out.println("Out of Toner.Cannot print any page.Fill the toner to print pages");
	}
	else {
	if (this.isDuplex == true) {
		this.noOfPages+=0.5;
	}
	else
	{
		this.noOfPages+=1;
	}
	this.tonerLevel-=5;
	System.out.println("Total no. of pages printed are: "+this.noOfPages);
	System.out.println("Toner level now is: "+this.tonerLevel);
}
}
 
}
