/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djplaylist;

/**
 *
 * @author yaaqovshkifati
 */
public class Song {

    private String songName, artistName;
    private int avgArtist, avgStreams, key;
 

    public Song(int key,String songName) {
        this.songName = songName;
        this.key= key;
    }
    @Override
    public String toString(){
        return this.songName;
    }

}
