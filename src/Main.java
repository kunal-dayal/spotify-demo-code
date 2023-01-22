import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Album a1 = new Album("siddhu","maouse");
        a1.addSongtoAlbum("123",7.4);
        a1.addSongtoAlbum("raat",9.00);

        Album a2 = new Album("king","kingkhan");
        a2.addSongtoAlbum("check",7.9);
        a2.addSongtoAlbum("cobra",8.7);

        LinkedList<Songs> playList = new LinkedList<>();

        System.out.println(a1.findSong("123"));

    }


}