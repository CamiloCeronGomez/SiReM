package cf.app.camiloceron.com.sirem.fragments;



import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cf.app.camiloceron.com.sirem.R;


public class Fragment_Datos extends Fragment {

    public static Fragment_Datos newInstance() {
        Fragment_Datos fragment = new Fragment_Datos();
        return fragment;
    }

    public Fragment_Datos() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.datos_fragment, container, false);
    }


}
