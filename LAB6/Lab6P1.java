enum Fruits{
	private char a;
	Apple('a'),Banana('b'),Citrus('c'),Dragonfruit('d'),Fig('f'),Grapes('g');
	
	
	Fruits (char a){
		this.a = a;
	}
	public void get(){
	
	}
}

public class Lab6P1{
	public static void main(String...args){
		for(Fruits f: Fruits.values()){
	System.out.println(f);
	}
}
}
