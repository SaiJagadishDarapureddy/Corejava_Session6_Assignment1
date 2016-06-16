package interf;

public class Interface_Calculation implements Interface1{

	
	
	@Override
	public void print() {
		System.out.println("VALUE OF A is "+a);
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("ADDITION is " +(a+b));
	}
	
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("SUBSTRACTION is " +(b-a));
	}
	
	public static void main(String[] args) {
		Interface_Calculation cal =new Interface_Calculation();
		
		cal.print();
		cal.sum();
		cal.sub();
		
	}


	

}
