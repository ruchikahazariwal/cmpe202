package lab6;


public class Patty extends LeafDecorator
{
	private String[] options ;
	private final static String open_brackets = "{{{{";
	private final static String close_brackets = "}}}}";
    
    
    public Patty( String desc )
    {
        super(desc) ;
    }
    
    
    public void setOptions( String[] options )
    {
        this.options = options ;
    }
    
    public String getDescription() 
    {
    	StringBuilder desc = new StringBuilder();
        for ( int i = 0; i<options.length; i++ )
        {
        	desc.append(" ");
        	desc.append(open_brackets);
            desc.append(options[i]);
            desc.append(close_brackets);
        }        
        return desc.toString() ;
    }
    
}