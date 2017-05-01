// The purpose of this class is to model a television
// Alexander Raschid 4-30-17
public class Television {
	//NOTE: the descriptions for these fields were taken from the lab pdf file
	
	
	//The manufacturer attribute will hold the brand name. This
	//cannot change once the television is created, so will be a named constant
	private String MANUFACTURER;
	
	//The screenSize attribute will hold the size of the television
	//screen.
	//This cannot change once the television has been created so will be a named
	//constant.
	private int SCREEN_SIZE;
	
	//The powerOn attribute will hold the value true if the power is on
	//and false if the power is off
	private boolean powerOn = false;
	
	//The channel attribute will hold the value of the station that the
	//television is showing.
	private int channel = 2;
	
	// The volume attribute will hold a number value representing the
	//loudness (0 being no sound)
	private int volume = 20;
	
	
	public Television(String manBrand, int screenSize){
		MANUFACTURER = manBrand;
		SCREEN_SIZE = screenSize;
	}
	
	//Accessors
	/** */
	public int getVolume(){return volume;}
	/** */
	public int getChannel(){return channel;}
	/** */
	public String getManufacturer(){return MANUFACTURER;}
	/** */
	public int getScreenSize(){return SCREEN_SIZE;}
	
	//Mutators
	/** changes the channel */
	public void setChannel(int chNum){channel = chNum;}
	/** changes power from the current boolean value to the oppasite, example
	 * being from off to on, or on to off.*/
	public void power(){ powerOn = !powerOn;}
	/** increases volume by 1*/
	public void increaseVolume(){ volume++;}
	/** decreases volume by 1*/
	public void decreaseVolume(){volume--;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
