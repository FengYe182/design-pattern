package com.fengye.demo;

/**
 * @ClassName Mp4MediaPlayer
 * @Description
 */
public class Mp4MediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String file) {

    }

    @Override
    public void playMp4(String file) {
        System.out.println("播放MP4视频: " + file);
    }
}
