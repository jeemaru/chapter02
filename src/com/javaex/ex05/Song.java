package com.javaex.ex05;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	
	
	//==============set영역================
	
	
	public Song() {
	}
	
	public Song(String title, String artist, String album, String composer, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		
		if(year<0) {
			this.year = 2022;
		}else {
			this.year = year;
		}
		System.out.println("Song(5)");
	}

	public Song(String title, String artist, String album, String composer, int year, int track) {
		//메모리에 올리는일
		this(title,artist,album,composer,year);//파라미터 5개짜리 생성자를 실행
		
		this.track = track;
		System.out.println("Song(6)");
	}
	
	
	
	
	
	public Song(int track) {
		super();
		this.track = track;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	//================get영역================
	
	
	public void showinfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+", "+composer+")");
		
	}

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

	public int getTrack() {
		return track;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}


}

