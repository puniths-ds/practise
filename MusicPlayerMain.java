package programs;
class Song {
    String name;
    Song prev;
    Song next;

    Song(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}

class MusicPlayer {
    Song head;
    Song current;

    // Add song at the end of the list
    void addSong(String name) {
        Song newSong = new Song(name);

        if (head == null) { // first song
            head = newSong;
            current = newSong;
        } else {
            Song temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newSong;
            newSong.prev = temp;
        }
    }

    // Display all songs
    void displaySongs() {
        Song temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }

    // Play next song
    void playNext() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.name);
        } else {
            System.out.println("No next song!");
        }
    }

    // Play previous song
    void playPrev() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.name);
        } else {
            System.out.println("No previous song!");
        }
    }
}

public class MusicPlayerMain {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.addSong("Tabhai");
        player.addSong("Rocky Bhai");
        player.addSong("Ramachari");

        System.out.println("Playlist:");
        player.displaySongs();

        System.out.println("\nNavigation:");
        player.playNext();  
        player.playNext();  
        player.playPrev();
        
        System.out.println("Previous");
        player.playPrev();
        player.playPrev();
        player.playPrev();
    }
}

