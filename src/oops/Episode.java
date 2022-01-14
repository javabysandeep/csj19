package oops;

public class Episode {
    int episodeId = 1;
    int episodeNumber = 1;
    String episodeTitle = "episode";
    String duration = "1 hour";
    static String season = "Some season";

    public static void main(String[] args) {
        Episode episode1 = new Episode();
        System.out.println(episode1);
        System.out.println(episode1.episodeId);
        System.out.println(episode1.episodeNumber);
        System.out.println(episode1.episodeTitle);
        System.out.println(episode1.duration);

        Episode episode2 = new Episode();
        Episode episode3 = new Episode();
        Episode episode4 = new Episode();

        System.out.println(Episode.season);
        System.out.println(Episode.season);
        System.out.println(Episode.season);
        System.out.println(Episode.season);
        Audio audio = new Audio();
        System.out.println(audio.audioReferenceId);
        System.out.println(audio.audioTitle);
        System.out.println(Audio.audioVersion);
        System.out.println(audio.isLargeAudio(99));
        Audio.print("audi file");
    }
}

class Audio {
    int audioReferenceId;
    String audioTitle;
    static String audioVersion;

    boolean isLargeAudio(int duration) {
        return duration > 100;
    }
    static void print(String message){
        System.out.println("Printing......."+message);
    }
}