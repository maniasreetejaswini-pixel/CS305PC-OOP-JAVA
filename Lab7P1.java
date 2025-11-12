import java.awt.event.*;
import java.awt.*;
class lab7P1{
public static void main(String[]args){
	frame f=new Frame();
	Textfield tf = new TextField(20);
	Button b =new Button("click");
	b.setsize(20,50);
	Label l=new Label();
	l.setSize(20,50);
	f.add(tf);
	f.add(b);
	f.add(l);
	f.setvisible(true);
	f.addWindowListener(new WindowAdaptor(){
		@Override
		public void WindowClosing(WindowEvent we){
			f.dispose();
			
		}
	});
	f.AddActionlistener(new Actionlistener(){
		@Override
		public void actionPerformed(ActionEvent ae){
			System.out.println(tf.getText());
			l.setPrefferedSize(new dimenison(100,100));
		
		});
	
	}


}
}
