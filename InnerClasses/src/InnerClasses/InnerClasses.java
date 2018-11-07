package InnerClasses;

public class InnerClasses {
    private int a=1;
    private String b;
    inner i=new inner();
	public int getA() {
		return a;
	}
	public String getB() {
		return b;
	}
    public class inner{
    	//InnerClasses s=new InnerClasses();
    	//private int a=2;
    	private int c;
    	private int d;
    	public int getC(){
    		//c=InnerClasses.this.a;
    		c=a;
    		return c;
    	}
    	public void printc() {
    		int c=getC();
    		System.out.println(c);
    	}
    	
    }
}
