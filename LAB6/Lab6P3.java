class AnooP{
	
		@Deprecated
		public void depM(){
			System.out.println("Deprecated Method...");
		}
		public void ovR(){
			System.out.println("Anoop");
		}
}
class AnnoC extends AnooP{
			@Override 
			public void ovR(){
					System.out.println("AnooC");
			}
}
public class Lab6P3{
		@SuppressWarnings("deprecation")
		public static void main(String...args){
			AnnoC ac = new AnnoC();
			ac.ovR();
			ac.depM();
			
		}
}
