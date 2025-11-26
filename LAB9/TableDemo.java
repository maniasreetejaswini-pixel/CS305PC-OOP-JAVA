import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TableDemo extends JFrame{
	Label l;
	TableDemo(){
			super("JTable pane Demo");
			
			String[] heading ={"Name","Course","Rollno"};
			String[][] data={ 
								{"DELL","CSE","123456"},
								{"BELL","CSD","123457"},
								{"CELL","CSIT","123458"},
								{"YELL","CSIT","123456"},
								
			
			};
			
			JTable jt = new JTable (data,heading);
			
			add(jt);
			setVisible(true);
			setSize(500,500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new TableDemo();
	}
}
