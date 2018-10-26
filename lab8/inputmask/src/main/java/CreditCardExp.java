/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler ;
	private String date = "" ;
	public static boolean deleteFlag = false;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
    public void setPrev( IKeyEventHandler prev) {
    	this.prevHandler = prev ;
    }

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else if(date.length()==2)
			date =  date + "/";
		return "[" + date + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if((ch.toLowerCase().equals("x") || ch.toLowerCase().equals("delete")) && cnt>=16 && cnt<20)
		{
			if(date.length()<=5 && date.length()!=0)
			{
				if(date.length()==3)
					date = date.substring(0, date.length() - 2);
				else
					date = date.substring(0, date.length() - 1);
			}
			else if(prevHandler != null)
			{
				prevHandler.key(ch, cnt) ;
			}
				
		}
		else if ( cnt >= 17 && cnt < 21 && !(ch.toLowerCase().equals("x")  || ch.toLowerCase().equals("delete")))
			date += ch ;
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}