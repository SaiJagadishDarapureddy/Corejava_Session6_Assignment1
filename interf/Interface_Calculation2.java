package interf;

public class Interface_Calculation2 implements Interface1{

	int c=30;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SQUARE OF a is "+(a*a));
		
	}
	
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("ADDITION is "+(a+b+c));
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
		System.out.println("SUBSTRACTION is " +(c-a-b));
	}

	public static void main(String[] args) {
		Interface_Calculation2 cal= new Interface_Calculation2();
		
		cal.print();
		cal.sum();
		cal.sub();
	}

}
