package cf.app.camiloceron.com.sirem;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Usuario on 03/10/2015.
 */


import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;

import cf.app.camiloceron.com.sirem.fragments.Fragment_Datos;
import cf.app.camiloceron.com.sirem.fragments.Fragment_Register;

public class MiFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 2;


    public MiFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment f = null;

        switch(position) {
            case 0:

                f = Fragment_Register.newInstance();
                break;
            case 1:

                f = Fragment_Datos.newInstance();
                break;
        }

        return f;
    }


}
