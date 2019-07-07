package com.fengye.demo;


/**
 * @ClassName AudioPlayer
 * @Description
 */
public class MediaPlayerImpl implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void paly(String audioType, String fileName) {
//        System.out.println("播放MP3格式" + fileName);

        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("播放MP3格式音乐 : " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.paly(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
