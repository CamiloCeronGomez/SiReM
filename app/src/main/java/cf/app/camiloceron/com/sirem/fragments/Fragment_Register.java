package cf.app.camiloceron.com.sirem.fragments;



import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cf.app.camiloceron.com.sirem.R;


public class Fragment_Register extends Fragment {

    public static Fragment_Register newInstance() {
        Fragment_Register fragment = new Fragment_Register();
        return fragment;
    }

    public Fragment_Register() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.register_fragment, container, false);
    }


}
