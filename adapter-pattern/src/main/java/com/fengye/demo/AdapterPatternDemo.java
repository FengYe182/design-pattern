package com.fengye.demo;

/**
 * @ClassName AdapterPatternDemo
 * @Description
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {

        MediaPlayerImpl mediaPlayer = new MediaPlayerImpl();

        mediaPlayer.paly("mp3", "beyond the horizon.mp3");
        mediaPlayer.paly("mp4", "alone.mp4");
        mediaPlayer.paly("vlc", "far far away.vlc");
        mediaPlayer.paly("avi", "mind me.avi");


    }
}
