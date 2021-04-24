package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MusicPlayer {

    public void initMethod() {
        System.out.println("bean initialization completed");
    }

    public void destroyMethod() {
        System.out.println("bean destruction completed");
    }

    private List<Music> musicList = new ArrayList<>();

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

    public void playMusic() {
        System.out.println("now playing: " + getSongs(musicList));
    }

    private List<String> getSongs(List<Music> list) {
        return list.stream()
                .map(Music::getSong)
                .collect(Collectors.toList());
    }

}
