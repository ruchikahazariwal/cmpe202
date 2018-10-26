/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler ;
	private String number = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
    public void setPrev( IKeyEventHandler prev) {
    	this.prevHandler = prev ;
    }

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else {
			if(number.length()==4 || number.length()==9 || number.length()==14) 
				number = number + " " ;
			return "[" + number + "]" + "  " ;
		}
	}	

	public void key(String ch, int cnt) {
		if((ch.toLowerCase().equals("x") || ch.toLowerCase().equals("delete")) && number.length()>0 && cnt<16)
		{
			if(number.length()==5 || number.length()==10 || number.length()==15)
				number = number.substring(0, number.length() - 2);
			else
				number = number.substring(0, number.length() - 1);
		}
		else if ( cnt <= 16 && !(ch.toLowerCase().equals("x") || ch.toLowerCase().equals("delete") ))
			number += ch ;
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}