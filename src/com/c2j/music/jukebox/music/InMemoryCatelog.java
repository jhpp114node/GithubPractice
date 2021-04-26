package com.c2j.music.jukebox.music;

import java.util.ArrayList;
import java.util.Collection;

public class InMemoryCatelog implements MusicUtilities {

    private static Collection<MusicItem> musicItemCollections = new ArrayList<>();

    static {
        musicItemCollections.add(new MusicItem());
        musicItemCollections.add(new MusicItem());
        musicItemCollections.add(new MusicItem());
        musicItemCollections.add(new MusicItem());
        musicItemCollections.add(new MusicItem());
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
