package com.javaex.ex09;

public class Ex01 {

//필드
	private int channel;
	private int volume;
	private boolean power;
	
//생성자
	public Ex01() {
		
	}
	
	public Ex01(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

		
//메소드 gs	
		public int getchannel () {
			return channel;
		}
		public int getvolume () {
			return volume; 
		}
		public boolean getpower () {
			return power; 
		}
	



//메소드 
		public void power (boolean power) {
			if(power==true) {
				this.power = true;
			}else {
				this.power = false;
			}	
		}
		
		
		
		
	public void channel (int channel) {
		if(this.power==true) {
			if(channel>255) {
				this.channel = 255; 
			}else if(channel<1) {
				this.channel = 1; 
			}
		}
	}
	
	public void channel (Boolean channel) {
		if(this.power==true) {
			if(channel==true) {
				this.channel++;
			}else {
				this.channel--;
			}
		}
	}
	
	public void volume (int volume) {
		if(this.power==true) {
			if(volume>100) {
				this.volume = 100;
			}else if(volume<0) {
				this.volume = 1;
			}
		}
	}
			
		
	public void volume (Boolean volume) {
		if(this.power=true) {
			if(volume==true) {
				this.volume++;
			}else {
				this.volume--;
			}
		}
	}
	
	
	

	
	
	public void status() {
		System.out.println("channel=" + channel + ", volume=" + volume + ", power=" + power);
	}




		
	}

	
	

