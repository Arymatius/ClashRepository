package andere;

import com.niklas.clashofclanswiki.R;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class AndereActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_andere);

		Rathaus();
		Clanburg();
		Dekoration();
		Hindernisse();
		
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color.rgb(255,165,0)));
	}

	private void Hindernisse() {

		ImageView hinderniss = (ImageView) findViewById(R.id.hindernisse);

		hinderniss.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(AndereActivity.this,Hindernisse.class));

			}
		});

	}

	private void Dekoration() {

		ImageView deko = (ImageView) findViewById(R.id.dekorationen);

		deko.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(AndereActivity.this,Dekorationen.class));

			}
		});

	}

	private void Clanburg() {

		ImageView clanburg = (ImageView) findViewById(R.id.clanburg);

		clanburg.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(AndereActivity.this,Clanburg.class));

			}
		});

	}

	private void Rathaus() {

		ImageView rathaus = (ImageView) findViewById(R.id.rathaus);

		rathaus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(AndereActivity.this,Rathaus.class));

			}
		});

	}

}
