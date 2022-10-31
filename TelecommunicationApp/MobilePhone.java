package TelecommunicationApp;

public class MobilePhone implements Telephone {
	
	private String myNumber;
	private boolean isRinging;
	private boolean isPowerOn;
	
	public MobilePhone(String  myNumber) {
		this.myNumber=myNumber;
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isPowerOn=true; 
		if(isPowerOn) {
		System.out.println("Phone powerOn");
		}
		else {
			System.out.println("the phone is SwichOff");
		}
		
		
	}

	@Override                              
	public void dail(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Now ringing "+phoneNumber+" on DeskPhone");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging && isPowerOn) {
			System.out.println("Answering the DeskPhone");
			isRinging=false;
		}
		else {
			System.out.println("Phone is not Ringing");
		}
		
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		if(myNumber==phoneNumber && isPowerOn) {
			isRinging=true;
			System.out.println("Phone Ringing");
		}
		else {
			System.out.println("Either wrong Number Entered or Phone is Power off");
		    isRinging=false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}


	
     

}
