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
    Button but_rail;
    Button but_wayrotation;
    TextView text_rail;
    TextView text_wayrotation;

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

        but_rail = (Button) view.findViewById(R.id.rail);
        text_rail = (TextView) view.findViewById(R.id.text_rail);
        but_wayrotation=(Button) view.findViewById(R.id.way_rotation);
        text_wayrotation= (TextView) view.findViewById(R.id.text_wayrotation);


        but_rail.setOnClickListener(new View.OnClickListener() {
            String rail_Deb;
            String rail_Inter;
            String rail_Exp;
            @Override
            public void onClick(View v) {


                Spinner spinner_list_level = myActivity.getSpinnerLevel();
                if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                    rail_Deb=Deb.Rail();
                    text_rail.setText(rail_Deb);
                }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        rail_Inter=Inter.Rail();
                        text_rail.setText(rail_Inter);
                    }
                    else{
                        rail_Exp=Exp.Rail();
                        text_rail.setText(rail_Exp);
                    }

                }

            }
        });

        return view;

    }
}
