package com.example.wildanimal;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.wildanimal.databinding.ActivityEmbedVideoBinding;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;

public class EmbedVideo extends AppCompatActivity {

    ActivityEmbedVideoBinding activityEmbedVideoBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityEmbedVideoBinding = ActivityEmbedVideoBinding.inflate(getLayoutInflater());
        setContentView(activityEmbedVideoBinding.getRoot());

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        activityEmbedVideoBinding.actionbarVideo.actionTitle.setText("Related video");


        activityEmbedVideoBinding.youtubeVideo.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "5kozt0uDa4c";
                youTubePlayer.cueVideo(videoId, 0);
            }
        });


    }
}