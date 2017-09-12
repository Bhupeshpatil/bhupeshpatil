import java.awt.*;
class Info extends Frame
{
    Label lname,laddress;
	TextField tname;
	TextArea taddress;
	Label l;
	Checkbox chkp,chkd,chks;
	Info()
   	{
	    setLayout(new FlowLayout());
		setTitle("info form");
		lname=new Label("Name");
	 	add(lname);
		tname=new TextField(20);
		add(tname);
		laddress=new Label("Address");
		add(laddress);
        taddress=new TextArea(20,20);
		add(taddress);
		
		l=new Label("Hobbies");
		add(l);
		chkp=new Checkbox("Playing");
		add(chkp);
		chkd=new Checkbox("Dancing");
		add(chkd);
		chks=new Checkbox("Singing");
		add(chks);
		
		setSize(400,400);
		setVisible(true);
	 }
	 public static void main(String args[])
	 {
	   new Info();
	 }
}	 
	
		
        
          		
		