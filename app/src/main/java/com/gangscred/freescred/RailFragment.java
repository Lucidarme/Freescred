package com.gangscred.freescred;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by lucidarme on 05/03/17.
 */

public class RailFragment extends Fragment {
    Debutant Deb;
    Intermediaire Inter;
    Expert Exp;

    MainActivity myActivity = null;

    private int mPage;

    public static RailFragment newInstance(int page) {
        Bundle args = new Bundle();
        RailFragment fragment = new RailFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rail, container, false);


        myActivity = (MainActivity) getActivity();
        Deb=new Debutant(this.getContext());
        Inter=new Intermediaire(this.getContext());
        Exp=new Expert(this.getContext());

        return view;

    }
}
