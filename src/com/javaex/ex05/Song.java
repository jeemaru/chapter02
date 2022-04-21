package com.javaex.ex05;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	//==============set영역================
	
	public void setTitle(String t) {
		title = t;
	}
	public void setArtist(String a) {
		artist = a;
	}
	public void setAlbum(String a2) {
		album = a2;
	}
	public void setComposer(String c) {
		composer = c;
	}
	public void setYear(int y) {
		year = y;
	}
	public void setTrack(String t2) {
		track = t2;
	}
	
	//================get영역================
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public String getTrack() {
		return track;
	}
	
	public void showinfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+", "+composer+")");
		
	}
	
}
