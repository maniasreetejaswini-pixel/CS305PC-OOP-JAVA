
class Lab3P3{
	public static void main(String...args){
		Lab3P3 l = new Lab3P3();
		l.display();l.display(10);l.display("String");l.display(10,"String");
	}
	public void show(){
		System.out.println("Methodwithout paras");
	}
	public void show(int x){
	System.out.println("method with int paras: "+x);
	}
	public void show(String s){
		System.out.println("Method with string paras: "+s);
	}
	public void show(int x,String s){
	System.out.println("MEthod with two paras int and string: "+x+" "+s);
}
}
