package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MusicPlayer {

    public void initMethod() {
        System.out.println("bean initialization completed");
    }

    public void destroyMethod() {
        System.out.println("bean destruction completed");
    }

    private List<Music> musicList = new ArrayList<>();

    private Music music;

    private ClassicalMusic classicalMusic;

    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public ClassicalMusic getClassicalMusic() {
        return classicalMusic;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
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

    public void playMusic() {
        System.out.println("now playing: " + getSongs(musicList));
    }

    public String playClassicalMusic() {
        return "now playing: " + classicalMusic.getSong();
    }

    private List<String> getSongs(List<Music> list) {
        return list.stream()
                .map(Music::getSong)
                .collect(Collectors.toList());
    }

}
