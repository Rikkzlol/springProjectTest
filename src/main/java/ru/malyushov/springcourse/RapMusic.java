package ru.malyushov.springcourse;


import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "NWA - Call to police";
    }
}
