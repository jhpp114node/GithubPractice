package com.c2j.music.jukebox.music;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class InMemoryCatelog implements MusicUtilities {

    private static Collection<MusicItem> musicItemCollections = new ArrayList<>();

    static {
        musicItemCollections.add(new MusicItem("Shape of You", "Ed Sheeran",
                MusicItem.MusicGenre.POP, MusicItem.Regions.NORTH_AMERICA, "2017-01-04"));
        musicItemCollections.add(new MusicItem("See You Again", "Wiz Khalifa, Charlie Puth",
                MusicItem.MusicGenre.RAP, MusicItem.Regions.NORTH_AMERICA, "2015-01-24"));
        musicItemCollections.add(new MusicItem("Dynamite", "BTS",
                MusicItem.MusicGenre.DISCO_POP, MusicItem.Regions.ASIA, "2020-10-03"));
        musicItemCollections.add(new MusicItem("Zombie", "The Cranberries",
                MusicItem.MusicGenre.ROCK, MusicItem.Regions.EUROPE, "2021-02-15"));
        // musicItemCollections.add(new MusicItem("", ""));
        musicItemCollections.add(new MusicItem());
        musicItemCollections.add(new MusicItem());
    }

    private InMemoryCatelog() {
        // I do not think I needed it
    }

    @Override
    public Collection<MusicItem> findByTitle() {
        return null;
    }

    @Override
    public Collection<MusicItem> findByRegion() {
        return null;
    }

    @Override
    public Collection<MusicItem> findByArtist() {
        return null;
    }

    @Override
    public Collection<MusicItem> findByGenre() {
        return null;
    }

    @Override
    public Collection<MusicItem> findByYear() {
        return null;
    }

    @Override
    public void displayAllMusic() {

    }

    @Override
    public void play() {

    }

    @Override
    public void printInvoice() {

    }

}
