package com.example.repaso2.controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Pagercontroller extends FragmentPagerAdapter {
int numoftabs;

    public Pagercontroller(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numoftabs=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Registrar();
            case 1:
                return new Entrar();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
