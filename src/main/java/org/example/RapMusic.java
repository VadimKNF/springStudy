package org.example;

import org.springframework.stereotype.Component;

//@Component("rapMusic")
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "neue deutche welle";
    }
}
