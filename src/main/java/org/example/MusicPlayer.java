package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class MusicPlayer {


    private List<Music> musicList = new ArrayList<>();

    private Ganres ganre;
    private Music rockMusic;
    private Music rapMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("rapMusic") Music rapMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playSong() {
        return "Now playing: " + rockMusic.getSong(1) + ", " + rapMusic.getSong(1) + ", " + classicalMusic.getSong(1);
    }

    public Ganres getGanre() {
        return ganre;
    }

    public void setGanre(Ganres ganre) {
        this.ganre = ganre;
    }

    public String playRandomSong(Ganres ganre) {
        Random random = new Random();
        int upperBound = 3;
        String song = null;
        int randomIndex = random.nextInt(upperBound);
        if (ganre == Ganres.ROCK){
            song = rockMusic.getSong(randomIndex);
        }

        if (ganre == Ganres.RAP){
            song = rapMusic.getSong(randomIndex);
        }

        if (ganre == Ganres.CLASSICAL){
            song = classicalMusic.getSong(randomIndex);
        }
        return song;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {}

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /*public void playMusic() {
        System.out.println("now playing: " + getSongs(musicList));
    }*/

    /*private List<String> getSongs(List<Music> list) {
        return list.stream()
                .map(Music::getSong)
                .collect(Collectors.toList());
    }*/

}
