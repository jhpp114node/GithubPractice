package com.c2j.music.jukebox.music;

import java.time.LocalDate;

public class MusicItem {
    public static enum MusicGenre {BLUES, CLASSICAL, JAZZ, RAP, COUNTRY, ROCK, CLASS_ROCK};
    public static enum Regions {ASIA, AFRICA, AUSTRALIA, EUROPE, NORTH_AMERICA, CENTRAL_AMERICA}

    private String title;
    private String artist;
    private MusicGenre musicGenre;
    private Regions region;
    private LocalDate year;
    private static final double DEFAULT_PRICE = 1.25;
    
}
