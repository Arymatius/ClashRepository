package defense;

import com.niklas.clashofclanswiki.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class DefensActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_defens);
		
		onClickKanone();
		onClickBogenTurm();
		Mienenwerfer();
		Luftabwehr();
		MagierTurm();
		VerborgenerTesla();
		X_Bogen();
		InfernoTurm();
		Mauer();
		
		
	}

	

	private void Mauer() {
		ImageView mauer = (ImageView) findViewById(R.id.drache);
		
		
		mauer.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(DefensActivity.this,Mauer.class));
				
			}
		});
		
		
	}

	private void InfernoTurm() {
		ImageView infTurm = (ImageView) findViewById(R.id.heiler);
		
		
		infTurm.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(DefensActivity.this,InfernoTurm.class));
				
			}
		});
		
		
	}

	private void X_Bogen() {
		ImageView x_bogen = (ImageView) findViewById(R.id.magier);
		
		
		x_bogen.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(DefensActivity.this,X_Bogen.class));
				
			}
		});
		
		
	}

	private void VerborgenerTesla() {
		ImageView tesla = (ImageView) findViewById(R.id.ballon);
		
		
		tesla.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(DefensActivity.this,VerborgenerTesla.class));
				
			}
		});
		
		
	}

	private void MagierTurm() {
		ImageView magier = (ImageView) findViewById(R.id.mauerbrecher);
		
		
		magier.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(DefensActivity.this,MagierTurm.class));
				
			}
		});
		
		
	}

	private void Luftabwehr() {
		
		ImageView luft = (ImageView) findViewById(R.id.riese);
		
		
		luft.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(DefensActivity.this,LuftAbwehr.class));
				
			}
		});
		
	}

	private void Mienenwerfer() {
		
		ImageView miene = (ImageView) findViewById(R.id.kobold);
		
		
		miene.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(DefensActivity.this,Minenwerfer.class));
				
			}
		});
		
	}

	private void onClickBogenTurm() {
		
		ImageView bogen = (ImageView) findViewById(R.id.bogenschuetze);
		
		
		bogen.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(DefensActivity.this,BogenTurm.class));
				
			}
		});
		
	}

	private void onClickKanone() {
		
		ImageView kanone = (ImageView) findViewById(R.id.barbar);
		
		kanone.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(DefensActivity.this,Kanone.class));
				
			}
		});
		
	}

	
}
