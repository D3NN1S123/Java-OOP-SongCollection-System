package lab8;

import java.util.*;

public class SongCollection {
	
	
	
	public String colName;
	public ArrayList<Song> songList;
	
	
	SongCollection(String s){
		songList = new ArrayList<Song>();
		colName = s;
	}

	public String getListName() {
		return colName;
	}

	public void setListName(String newName) {
		colName = newName;
	}

	public List<Song> getListofSongs() {
		
		return songList;
	}

	public void addSongs(List<Song> alist) {

		songList.addAll(alist);
	}

	public void removeSong(Song s) {
		
		songList.remove(s);
	}
	
	
	SongCollection(SongCollection s){
		
		songList = new ArrayList<Song>(s.songList);
		
	}
	
	
	

	public boolean contains(Song s) {
		

		if(songList.contains(s)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean inSongCollection(String artistName) {
		
		
		for(int i=0; i<songList.size(); i++) {
			if(songList.get(i).getSongArtist().equals(artistName)) {
				return true;
			}
		}
		
		return false;
		
		
		
	}

	public ArrayList<Song> getSongsforArtist(String string) {

		ArrayList<Song> temp = new ArrayList<Song>();
		
		for(int i=0; i<songList.size(); i++) {
			if(songList.get(i).getSongArtist().equals(string)) {
				temp.add(songList.get(i));
			}
		}
		
		return temp;
	}

	public String totalListeningTime() {
		
		int totalTime = 0;
		int mins = 0;
		int hours = 0;
		int secs =0;
		
		
		for(int i=0; i<songList.size(); i++) {
			totalTime += songList.get(i).getSongLength();
		}
		
		if(totalTime <3600) {
			
			secs = totalTime%60;
			
			int tempSum = totalTime - secs;
			
			mins = tempSum/60;
	
		}
		else {
			mins = totalTime%3600;
			hours = (totalTime - mins)/3600;
			
			secs = mins%60;
			
			mins = (mins - secs)/60;
			
			
		}
		
		if(secs<10) {
			return "Total Listening Time: "+hours+":"+mins+":0"+secs;
		}
		else {
			return "Total Listening Time: "+hours+":"+mins+":"+secs;
		}
	}

	
	
	

}
