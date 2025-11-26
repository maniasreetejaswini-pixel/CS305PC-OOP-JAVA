import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TabbedDemo extends JFrame{
		Label l;
		TabbedDemo(){
			super("Tabbed pane Demo");
			JTabbedPane jtp = new JTabbedPane();
			jtp.addTab("Tab1",new Label("Tabbed pane1"));
			jtp.addTab("Tab2",new Label("Tabbed pane2"));
			jtp.addTab("Tab3",new Label("Tabbed pane3"));
			
			add(jtp);
			setVisible(true);
			setSize(500,500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String...args){
			new TabbedDemo();
		}
}



