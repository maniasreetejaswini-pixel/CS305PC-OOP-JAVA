class Lab3P4{
	public static void main(String...args){
	Lab3P4 lp=new Lab3P4();
	lp.display();
	lp.display(10);
	lp.display(10,20);
	
	}
	void display(){
		System.out.println("MOL without parameters");
	}
	void display(int x){
		System.out.println("MOL with parameters"+x);
	}
	void display(int x,int y){
		System.out.println("MOL with 2 param x+y is"+(x+y));
	}
}				
