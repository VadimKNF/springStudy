package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    List<String> songsList = new ArrayList<>();

    public List<String> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<String> songsList) {
        this.songsList = songsList;
    }

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong(int index) {
        return songsList.get(index);
    }
}
