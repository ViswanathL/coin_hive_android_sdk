package com.theah64.coinhivesdkandroidexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.theah64.coinhive.BaseCoinHiveFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class CoinHiveExampleFragment extends BaseCoinHiveFragment {


    public CoinHiveExampleFragment() {
        // Required empty public constructor
    }

    @Override
    public boolean isHideMining() {
        return false;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coin_hive_example, container, false);
    }

}
