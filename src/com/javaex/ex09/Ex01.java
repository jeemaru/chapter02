package com.javaex.ex09;

public class Ex01 {

	public int channel;
	public int volume;
	public boolean power;
	
	public Ex01() {
		
	}
	
	public Ex01(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		if(volume<=100) {
			this.volume = volume;
		}else if(volume<0){
			this.volume = 0;
		}else {
			this.volume = 100;
		}
		this.power = power;
	}



	public void setChannel (int channel) {
		this.channel = channel; 
	}
	public void setvolume (int volume) {
		this.volume = volume; 
	}
	public int getChannel (int channel) {
		return channel;
	}
	public int getvolume (int volume) {
		return volume; 
	}
	
	
	public void power(true) {
		power = on;
	}else {
		power = off;
	}
	
	
}
