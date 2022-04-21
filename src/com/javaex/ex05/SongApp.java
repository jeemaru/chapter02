package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song 아이유 = new Song();
		아이유.setTitle("좋은날");
		아이유.setArtist("아이유");
		아이유.setAlbum("real");
		아이유.setTrack("3번 track");
		아이유.setComposer("이민수 작곡");
		아이유.setYear(2010);
		
		Song BIGBANG = new Song();
		BIGBANG.setTitle("거짓말");
		BIGBANG.setArtist("BIGBANG");
		BIGBANG.setAlbum("Always");
		BIGBANG.setTrack("2번 track");
		BIGBANG.setComposer("G-DRAGON 작곡");
		BIGBANG.setYear(2007);
		
		Song 버스커버스커 = new Song();
		버스커버스커.setTitle("벚꽃엔딩");
		버스커버스커.setArtist("버스커버스커");
		버스커버스커.setAlbum("버스커버스커 1집");
		버스커버스커.setTrack("4번 track");
		버스커버스커.setComposer("장범준 작곡");
		버스커버스커.setYear(2012);

		아이유.showinfo();
		BIGBANG.showinfo();
		버스커버스커.showinfo();
		
	}

}
