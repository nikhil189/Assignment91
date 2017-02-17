/**
 * 
 */
package acadGlidAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author nikhil13686
 *
 */
public class HDTVSorter implements Comparator<HDTV> {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- 
	 * Return Type - void
	 */
	public static void main(String[] args)
	{
		List<HDTV> objListHDTV = new ArrayList<HDTV>();
		objListHDTV.add(new HDTV("Samsung",51));
		objListHDTV.add(new HDTV("Onida",42));
		objListHDTV.add(new HDTV("LG",27));
		Collections.sort(objListHDTV,new HDTVSorter());
		for(HDTV objHDTV :objListHDTV)
		{
			System.out.println(objHDTV);
		}
	}

	/* implementing comparator method for Comparator class
	 */
	@Override
	public int compare(HDTV objHDTV1, HDTV objHDTV2)
	{
		if(objHDTV1.getSize() > objHDTV2.getSize())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
