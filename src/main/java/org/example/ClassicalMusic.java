package org.example;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("bean initialized");
    }

    public void doMyDestroy() {
        System.out.println("dean destroyed");
    }

    @Override
    public String getSong() {
        return "Hungarian rapsody";
    }
}
