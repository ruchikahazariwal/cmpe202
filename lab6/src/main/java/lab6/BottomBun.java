package lab6;

public class BottomBun extends LeafDecorator
{
    private String[] options ;
    
    
    public BottomBun( String desc )
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
        	desc.append("  ");
        	desc.append(options[i]);
        	if(i!=options.length-1)
        		desc.append("\n");
        }        
        return desc.toString() ;
    }
    
}