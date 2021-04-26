package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{

    List<String> songsList = new ArrayList<>();

    public List<String> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<String> songsList) {
        this.songsList = songsList;
    }

    @Override
    public String getSong(int index) {
        return songsList.get(index);
    }
}
