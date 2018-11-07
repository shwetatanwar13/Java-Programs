package encapsulationPrinterProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Printer HP=new Printer(0, 0, true);
    System.out.println("Current no of pages: "+HP.getNoOfPages());
    System.out.println("Current Toner level: "+HP.getTonerLevel());
    HP.fillTonerLevel(45);
    HP.printPage();
	}

}
