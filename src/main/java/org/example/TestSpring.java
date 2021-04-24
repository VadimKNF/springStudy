package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicBean = context.getBean("classicBean", ClassicalMusic.class);

        System.out.println(classicBean.getSong());

        /*MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        firstMusicPlayer.playMusic();*/

        context.close();
    }
}
