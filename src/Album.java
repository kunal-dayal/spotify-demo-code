import java.util.ArrayList;
import java.util.*;

public class Album {

    private String name;
    private String album;
    private List<Songs> song;

    public Album(String name, String album) {
        this.name = name;
        this.album = album;
        this.song = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public List<Songs> getSong() {
        return song;
    }

    public void setSong(List<Songs> song) {
        this.song = song;
    }

    public boolean findSong(String title){
        for(Songs s:song){
            if(s.getTitle() == title){
                return true;
            }
        }
        return false;
    }

    void addSongtoAlbum (String title,double duration){
        Songs s = new Songs(name,duration);
        if(findSong(title)){
            System.out.println("song is already present into the album");
        }else{
            song.add(s);
            System.out.println("new song has been added to album");
        }
    }

    public void addtoplayList(String title, LinkedList<Songs> playlist){
        if(findSong(title)){
            for(Songs s:song){
                if(s.getTitle().equals(title)){
                    playlist.add(s);
                }
                System.out.println("song has been added into your laylist");
                break;
            }
        }else{
            System.out.println("song is not present in the album");
        }
    }
}
