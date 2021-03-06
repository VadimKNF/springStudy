package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        List<String> rockList = rockMusic.getSongsList();
        rockList.add("TNT");
        rockList.add("AC/DC");
        rockList.add("DU HAST");
        rockMusic.setSongsList(rockList);

        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);
        List<String> rapList = rapMusic.getSongsList();
        rapList.add("Neue deutche welle");
        rapList.add("You dont know");
        rapList.add("White America");
        rapMusic.setSongsList(rapList);

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        List<String> classicalList = classicalMusic.getSongsList();
        classicalList.add("Hungarian rhapsody");
        classicalList.add("Seasons");
        classicalList.add("Chaikovsky 6th symphony");
        classicalMusic.setSongsList(classicalList);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        musicPlayer.setGanre(Ganres.RAP);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
