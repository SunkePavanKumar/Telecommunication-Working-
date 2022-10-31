package TelecommunicationApp;

public  class  Desk implements Telephone {
	
	private String  myNumber;
	private boolean isRinging;
	
	public Desk(String  myNumber) {
		this.myNumber=myNumber;
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("DeskPhone is always on");
		
		
	}

	@Override
	public void dail(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Now ringing "+phoneNumber+" on DeskPhone");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging) {
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
		if(phoneNumber==myNumber) {
			isRinging=true;
			System.out.println("Phone Ringing");
		}
		else {
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
