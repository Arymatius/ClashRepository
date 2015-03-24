package armee;

import com.niklas.clashofclanswiki.R;
import com.niklas.clashofclanswiki.R.id;
import com.niklas.clashofclanswiki.R.layout;
import com.niklas.clashofclanswiki.R.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ArmeeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_armee);

		Armeelager();
		Kaserne();
		DunkleKaserne();
		Labor();
		Zauberfabrik();
		adbk();
		adbok();
	}

	private void Armeelager() {

		ImageView armeelager = (ImageView) findViewById(R.id.barbar);

		armeelager.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(ArmeeActivity.this,Armeelager.class));

			}
		});

	}

	private void Kaserne() {

		ImageView kaserne = (ImageView) findViewById(R.id.bogenschuetze);

		kaserne.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(ArmeeActivity.this,Kaserne.class));

			}
		});

	}

	private void DunkleKaserne() {
		ImageView dkaserne = (ImageView) findViewById(R.id.kobold);

		dkaserne.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(ArmeeActivity.this,DunkleKaserne.class));

			}
		});

	}

	private void Labor() {

		ImageView labor = (ImageView) findViewById(R.id.riese);

		labor.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(ArmeeActivity.this,Labor.class));

			}
		});

	}

	private void Zauberfabrik() {

		ImageView zauberfabrik = (ImageView) findViewById(R.id.mauerbrecher);

		zauberfabrik.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(ArmeeActivity.this,Zauberfabrik.class));
			}
		});

	}

	private void adbk() {
		ImageView adbk = (ImageView) findViewById(R.id.ballon);

		adbk.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(ArmeeActivity.this,ADBK.class));

			}
		});

	}

	private void adbok() {

		ImageView adbok = (ImageView) findViewById(R.id.magier);

		adbok.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(ArmeeActivity.this,ADBOK.class));

			}
		});

	}

}
