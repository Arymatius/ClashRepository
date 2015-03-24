package truppen;

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

public class TruppenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_truppen);
		
		Barbar();
		Bogenschuetze();
		Kobold();
		Riese();
		Mauerbrecher();
		Ballon();
		Magier();
		Heiler();
		Drache();
		PEKKA();
		
	
	}
	
private void Barbar() {
		
	ImageView barbar = (ImageView) findViewById(R.id.barbar);
	
	barbar.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			startActivity(new Intent(TruppenActivity.this,Barbar.class));
			
		}
	});
	
	}

private void Bogenschuetze() {
		
		ImageView bogenschuetze = (ImageView) findViewById(R.id.bogenschuetze);
		
		bogenschuetze.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(TruppenActivity.this, Bogenschuetze.class));
				
			}
		});
		
	}

	private void Kobold() {
		
		ImageView kobold = (ImageView) findViewById(R.id.kobold);
		
		kobold.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(TruppenActivity.this, Kobold.class));
				
			}
		});
		
	}

	private void Riese() {
		
		ImageView riese = (ImageView) findViewById(R.id.riese);
		
		riese.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(TruppenActivity.this,Riese.class));
				
			}
		});
		
	}
	
private void Mauerbrecher() {
		
		ImageView mauerbrecher = (ImageView) findViewById(R.id.mauerbrecher);
		
		mauerbrecher.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(TruppenActivity.this, Mauerbrecher.class));
				
			}
		});
		
	}

	private void Ballon() {
		ImageView ballon = (ImageView) findViewById(R.id.ballon);
		
		ballon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(TruppenActivity.this, Ballon.class));
				
			}
		});
		
	}

	private void Magier() {
		
		ImageView magier = (ImageView) findViewById(R.id.magier);
		
		magier.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(TruppenActivity.this,Magier.class));
				
			}
		});
		
	}

	private void Heiler() {
		
		ImageView heiler = (ImageView) findViewById(R.id.heiler);
		
		heiler.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(TruppenActivity.this,Heiler.class));
				
			}
		});
		
	}

	private void Drache() {
		ImageView drache = (ImageView) findViewById(R.id.drache);
		
		drache.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(TruppenActivity.this,Drache.class));
				
			}
		});
		
	}

	private void PEKKA() {
		
		ImageView pekka = (ImageView) findViewById(R.id.pekka);
		
		pekka.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(TruppenActivity.this,PEKKA.class));
				
			}
		});
		
	}

}
