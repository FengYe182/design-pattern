package com.fengye.demo;

/**
 * @ClassName AdvancedMediaPlayerImpl
 * @Description
 */
public class VlcMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String file) {
        System.out.println("播放VLC格式视频: " + file);
    }

    @Override
    public void playMp4(String file) {

    }

}
