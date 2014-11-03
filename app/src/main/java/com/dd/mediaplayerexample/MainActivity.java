package com.dd.mediaplayerexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity
	extends Activity
{
	private static final ArrayList<MediaService.MediaItem> sSamplePlaylist = new ArrayList<MediaService.MediaItem>(4);
	static{
		sSamplePlaylist.add(new MediaService.MediaItem("Vocal Trance",   "http://pub7.di.fm/di_vocaltrance_aac?type=.mp3",   "http://api.audioaddict.com/v1/assets/image/009b4fcdb032cceee6f3da5efd4a86e9.png?size=400x400"));
		sSamplePlaylist.add(new MediaService.MediaItem("Trance",         "http://pub7.di.fm/di_trance_aac?type=.mp3",        "http://api.audioaddict.com/v1/assets/image/befc1043f0a216128f8570d3664856f7.png?size=400x400"));
		sSamplePlaylist.add(new MediaService.MediaItem("Classic Trance", "http://pub7.di.fm/di_classictrance_aac?type=.mp3", "http://api.audioaddict.com/v1/assets/image/ad112b71e9682c79343a4df45d419297.png?size=400x400"));
		sSamplePlaylist.add(new MediaService.MediaItem("Electro Swing",  "http://pub7.di.fm/di_electroswing_aac?type=.mp3",  "http://api.audioaddict.com/v1/assets/image/82106fc48c70df5abefee0cc92a7379b.jpg?size=400x400"));
	};

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		findViewById(R.id.media_play).setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				startService(MediaService.createPlaylistIntent(v.getContext(), sSamplePlaylist));
			}
		});
	}
}
