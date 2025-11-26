import java.util.Scanner;
class Lab3P5{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter int value");		
		int a=s.nextInt();
		
		System.out.println("enter a String value");	
		String b=s.nextLine();
		Lab3P5 lp1=new Lab3P5();
		Lab3P5 lp2=new Lab3P5(a);
		Lab3P5 lp3=new Lab3P5(a,b);
		Lab3P5 lp4=new Lab3P5(b);
	}
	Lab3P5(){
		System.out.println("constructor without parameters");
	}
	Lab3P5(int x){
		System.out.println("constructor with parameters"+x);
	}
	Lab3P5(int x,String y){
		System.out.println("constructor with 2 param x is "+x+" y is "+y);
	}	
	Lab3P5(String s){
		System.out.println(s);
	}
}				
