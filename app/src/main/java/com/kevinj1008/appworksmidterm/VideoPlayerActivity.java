//package com.kevinj1008.appworksmidterm;
//
//import android.app.Activity;
//import android.media.AudioManager;
//import android.media.MediaPlayer;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.MotionEvent;
//import android.view.SurfaceHolder;
//import android.view.SurfaceView;
//import android.widget.FrameLayout;
//
//import java.io.IOException;
//
//public class VideoPlayerActivity extends Activity implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, VideoControllerView.MediaPlayerControl {
//    SurfaceView mVideoSurface;
//    MediaPlayer mPlayer;
//    VideoControllerView mController;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.video_player);
//
//        mVideoSurface = (SurfaceView) findViewById(R.id.video_surface_view);
//        SurfaceHolder videoHolder = mVideoSurface.getHolder();
//        videoHolder.addCallback(this);
//
//        mPlayer = new MediaPlayer();
//        mController = new VideoControllerView(this);
//
//        try {
//            mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//            mPlayer.setDataSource(this, Uri.parse("https://s3-ap-northeast-1.amazonaws.com/mid-exam/Video/taeyeon.mp4"));
//            mPlayer.setOnPreparedListener(this);
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        } catch (SecurityException e) {
//            e.printStackTrace();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        mController.show();
//        return false;
//    }
//
//    // Implement SurfaceHolder.Callback
//    @Override
//    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
//
//    }
//
//    @Override
//    public void surfaceCreated(SurfaceHolder holder) {
//        mPlayer.setDisplay(holder);
//        mPlayer.prepareAsync();
//    }
//
//    @Override
//    public void surfaceDestroyed(SurfaceHolder holder) {
//
//    }
//    // End SurfaceHolder.Callback
//
//    // Implement MediaPlayer.OnPreparedListener
//    @Override
//    public void onPrepared(MediaPlayer mp) {
//        mController.setMediaPlayer(this);
//        mController.setAnchorView((FrameLayout) findViewById(R.id.video_surface_container));
//        mPlayer.start();
//    }
//    // End MediaPlayer.OnPreparedListener
//
//    // Implement VideoMediaController.MediaPlayerControl
//    @Override
//    public boolean canPause() {
//        return true;
//    }
//
//    @Override
//    public boolean canSeekBackward() {
//        return true;
//    }
//
//    @Override
//    public boolean canSeekForward() {
//        return true;
//    }
//
//    @Override
//    public int getBufferPercentage() {
//        return 0;
//    }
//
//    @Override
//    public int getCurrentPosition() {
//        return mPlayer.getCurrentPosition();
//    }
//
//    @Override
//    public int getDuration() {
//        return mPlayer.getDuration();
//    }
//
//    @Override
//    public boolean isPlaying() {
//        return mPlayer.isPlaying();
//    }
//
//    @Override
//    public void pause() {
//        mPlayer.pause();
//    }
//
//    @Override
//    public void volume() {
//        mPlayer.setVolume(1,1);
//    }
//
//    @Override
//    public void mute() {
//        mPlayer.setVolume(0,0);
//    }
//
//    @Override
//    public boolean isMute() {
//        mPlayer.setVolume(1,1);
//        return false;
//    }
//
//    @Override
//    public void seekTo(int i) {
//        mPlayer.seekTo(i);
//    }
//
//    @Override
//    public void start() {
//        mPlayer.start();
//    }
//
//    @Override
//    public boolean isFullScreen() {
//        return false;
//    }
//
//    @Override
//    public void toggleFullScreen() {
//
//    }
//    // End VideoMediaController.MediaPlayerControl
//
//}
