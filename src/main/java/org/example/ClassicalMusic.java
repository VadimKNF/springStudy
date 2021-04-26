package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    @PostConstruct
    public void initMethod() {
        System.out.println("bean initialized");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("bean destroyed");
    }

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
