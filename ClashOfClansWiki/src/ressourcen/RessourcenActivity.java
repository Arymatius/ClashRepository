package ressourcen;

import com.niklas.clashofclanswiki.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class RessourcenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ressourcen);
		
		Goldmine();
		Goldlager();
		Elexiersammler();
		Elexierlager();
		BfdE();
		LfdE();
		Bauhuette();
	}
	
private void Goldmine() {
		
		ImageView goldmine = (ImageView) findViewById(R.id.goldmine);
		
		goldmine.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(RessourcenActivity.this,Goldmine.class));
			}
		});
		
	}
	
private void Goldlager() {
		
		ImageView goldlager = (ImageView) findViewById(R.id.goldlager);
		
		goldlager.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(RessourcenActivity.this,Goldlager.class));
				
			}
		});
		
	}

	private void Elexiersammler() {
		
		ImageView elexiersammler = (ImageView) findViewById(R.id.elexiersammler);
		
		elexiersammler.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(RessourcenActivity.this,ElexierSammler.class));
				
			}
		});
		
	}

	private void Elexierlager() {
		
		ImageView elexierlager = (ImageView) findViewById(R.id.elexierlager);
		
		elexierlager.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(RessourcenActivity.this,ElexierLager.class));
				
			}
		});
		
	}

	private void BfdE() {
		
		ImageView bfde = (ImageView) findViewById(R.id.bfde);
		
		bfde.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(RessourcenActivity.this,BFDE.class));
				
			}
		});
		
	}

	private void LfdE() {
		ImageView lfde = (ImageView) findViewById(R.id.lfde);
		
		lfde.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(RessourcenActivity.this,LFDE.class));
				
			}
		});
		
	}

	private void Bauhuette() {
		
		ImageView bauhuette = (ImageView) findViewById(R.id.bauhuette);
		
		bauhuette.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(RessourcenActivity.this,Bauhuette.class));
				
			}
		});
		
	}

	
}
