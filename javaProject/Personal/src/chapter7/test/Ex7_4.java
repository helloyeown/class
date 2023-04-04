package chapter7.test;

class MyTv{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int setChannel(int channel) {
		if(channel>MAX_CHANNEL || MIN_CHANNEL<channel)
			return;
		return channel;
	}
	
	
	
}

public class Ex7_4 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		
				
		
	}
}
