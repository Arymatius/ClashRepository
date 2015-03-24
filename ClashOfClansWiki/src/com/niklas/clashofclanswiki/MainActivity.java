package com.niklas.clashofclanswiki;

import ressourcen.RessourcenActivity;
import truppen.TruppenActivity;
import defense.DefensActivity;
import andere.AndereActivity;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.MediaController.MediaPlayerControl;
import armee.ArmeeActivity;

public class MainActivity extends Activity {
	
	MediaPlayer soundtrack;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		defens();
		truppen();
		armee();
		ressourcen();
		andere();
		
		soundtrack = MediaPlayer.create(this, R.raw.clash);
		soundtrack.start();
		
		
	}

	

	private void andere() {

		ImageView andere = (ImageView) findViewById(R.id.andere);

		andere.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				startActivity(new Intent(MainActivity.this, AndereActivity.class));
				
			}
		});

	}

	private void ressourcen() {

		ImageView res = (ImageView) findViewById(R.id.ressource);

		res.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				startActivity(new Intent(MainActivity.this, RessourcenActivity.class));
				
			}
		});

	}

	private void armee() {

		ImageView armee = (ImageView) findViewById(R.id.armee);

		armee.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				startActivity(new Intent(MainActivity.this, ArmeeActivity.class));

			}
		});

	}

	private void truppen() {

		ImageView truppen = (ImageView) findViewById(R.id.truppen);

		truppen.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				startActivity(new Intent(MainActivity.this, TruppenActivity.class));

			}
		});

	}

	private void defens() {

		ImageView defens = (ImageView) findViewById(R.id.defense);

		defens.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				startActivity(new Intent(MainActivity.this, DefensActivity.class));

			}
		});

	}

}
