/**
 * 
 */
package acadGlidAssignments;

/**
 * @author nikhil
 *
 */
public class HDTV 
{
	private String BrandName; // variable To Store Brand Name
	private int Size; // variable to Store Size
	// constructor to initialize properties
	HDTV(String BrandName,int Size)
	{
		this.setBrandName(BrandName);
		this.setSize(Size);
	}
	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return BrandName;
	}
	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return Size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		Size = size;
	}
	public String toString(){
        return "BrandName: "+this.getBrandName()+"-- Size: "+this.getSize();
    }

}
