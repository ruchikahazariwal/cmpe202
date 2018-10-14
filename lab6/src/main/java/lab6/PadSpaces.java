package lab6;

public class PadSpaces {
	 /**
     * Helper:  Pad Spaces for a Line
     * @param  num Num Spaces to Pad
     * @return     Padded Line
     */
    public static String padSpaces(int num) {
    	StringBuffer spaces = new StringBuffer();
        for ( int i = 0; i<num; i++ )
            spaces.append(" ");           
        return spaces.toString() ;     
    }  
}
