package ressourcenTabs;

import com.niklas.clashofclanswiki.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BFDETabelleFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		 return LayoutInflater.from(getActivity()).inflate(R.layout.bfde_tabelle, null);
		
	

	}
}
