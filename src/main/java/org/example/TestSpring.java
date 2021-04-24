package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music rapBean = context.getBean("rapMusic", Music.class);
        //Music classicalBean = context.getBean("classicalMusic", Music.class);
        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playClassicalMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        //System.out.println(rapBean.getSong());
        //System.out.println(classicalBean.getSong());

        /*MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        firstMusicPlayer.playMusic();*/

        context.close();
    }
}
