package TelecommunicationApp;

public interface Telephone {
	/**
	 * poweron
	 * Dial a number
	 * answer a phone call
	 * call onother phone
	 * Is phone is ringing
	 * 
	 */
	void powerOn();
	void dail(String phoneNumber);
	void answer();
	boolean callPhone(String phoneNumber);
	boolean isRinging();

	
	

}
