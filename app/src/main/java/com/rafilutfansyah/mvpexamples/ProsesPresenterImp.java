package com.rafilutfansyah.mvpexamples;

import android.text.TextUtils;

/**
 * Created by Rafi Lutfansyah on 12/04/2017.
 */

public class ProsesPresenterImp implements ProsesPresenter {

    private ProsesView prosesView;

    public ProsesPresenterImp(ProsesView prosesView) {
        this.prosesView = prosesView;
    }

    public void proses(int angka) {
        if(angka%2==0) {
            prosesView.bilanganGenap();
        }
        else {
            prosesView.bilanganGanjil();
        }
    }
}
