package com.c2j.music.jukebox.music;

import java.util.Collection;

public interface MusicUtilities {
    public Collection<MusicItem> findByTitle() throws IllegalArgumentException;
    public Collection<MusicItem> findByRegion() throws IllegalArgumentException;
    public Collection<MusicItem> findByArtist() throws IllegalArgumentException;
    public Collection<MusicItem> findByGenre() throws IllegalArgumentException;
    public Collection<MusicItem> findByYear() throws IllegalArgumentException;
    public void displayAllMusic();
    public void play();
    public void printInvoice();
}
