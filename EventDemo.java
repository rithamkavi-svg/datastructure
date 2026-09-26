import java.awt.*;
import java.awt.event.*;

public class EventDemo extends Frame implements ActionListener{
 
    TextField tf;
    Label lbl;
    Button btn;

   EventDemo(){
    
      tf=new TextField(20);
      btn=new Button("Show");
      lbl=new Label ("Enter text and click Show");

     btn.addActionListener(this);
     
     setLayout(new FlowLayout());
     
     add(new Label("Enter Text:"));
     add(tf);
     add(btn)'
     add(lbl);
    
   setTitle("Event Handling:");
   setSize(350,200);
   setVisible(true);
   
  addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
       dispose();
     }
    }
  }
} 