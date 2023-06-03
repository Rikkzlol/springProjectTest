package ru.malyushov.springcourse;

import org.springframework.stereotype.Component;


public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "wind cries Mary";
    }
}
