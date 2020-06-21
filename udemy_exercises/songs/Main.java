package udemy_exercises.songs;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Saiyonee", "Euphoria");
        album.addSong("Saiyonee", 4.00);
        album.addSong("Rab Jaane", 3.35);
        album.addSong("Ab na jaa", 4.03);
        album.addSong("Aana meri gali", 3.45);
        album.addSong("Dil", 4.10);
        albums.add(album);

        album = new Album("Boondein", "Silk Route");
        album.addSong("Dooba Dooba", 3.41);
        album.addSong("Humsafar", 4.12);
        album.addSong("Pehchan", 4.02);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Aana meri gali", playList);
        albums.get(0).addToPlayList("Dil", playList);
        albums.get(0).addToPlayList("Ab na jaa", playList);
        albums.get(1).addToPlayList(1,playList);

        //Error Checking
        albums.get(0).addToPlayList("Made in India", playList);

        albums.get(1).addToPlayList(1,playList);
        albums.get(1).addToPlayList(2,playList);

        //Error Checking
        albums.get(1).addToPlayList(10,playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size()==0){
            System.out.println("Songlist Empty");
            return;
        }
        else{
            System.out.println("Playing.." +listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Playing " + listIterator.next().toString());
                    }
                    else {
                        System.out.println("End of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Playing " +listIterator.previous().toString());
                    }
                    else {
                        System.out.println("Start of playlist");;
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Playing " +listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Beginning of playlist");
                        }
                    }else {
                        if (listIterator.hasNext()){
                            System.out.println("Replaying " +listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("End of list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;

                case 5:
                    if (playList.size() >0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Playing "+ listIterator.next());
                        } else if (listIterator.hasPrevious()){
                            System.out.println("Playing " +listIterator.previous());
                        }
                    }
                case 6:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Options");
        System.out.println("0 - Quit\n"+
                "1 - Play next song\n" +
                "2 - Previous song\n" +
                "3 - Replay\n" +
                "4 - List songs\n" +
                "5 - Delete song\n" +
                "6 - Print options\n");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
