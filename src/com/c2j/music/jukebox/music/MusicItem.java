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

    public MusicItem() {

    }

    public MusicItem(String title, String artist, MusicGenre musicGenre, Regions region, LocalDate year) {
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) throws IllegalArgumentException {
        if (title == null) {
            System.out.println("Illegal Exception");
            throw new IllegalArgumentException();
        }
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }

    public Regions getRegion() {
        return region;
    }

    public void setRegion(Regions region) {
        this.region = region;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }
}
