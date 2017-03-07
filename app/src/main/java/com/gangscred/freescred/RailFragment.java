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
    Button but_rail_in;
    Button but_rail_out;
    TextView text_rail_in;
    TextView text_rail_out;

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

        but_rail_in = (Button) view.findViewById(R.id.rail_in);
        text_rail_in = (TextView) view.findViewById(R.id.text_rail_in);
        but_rail_out =(Button) view.findViewById(R.id.rail_out);
        text_rail_out = (TextView) view.findViewById(R.id.text_rail_out);


        but_rail_in.setOnClickListener(new View.OnClickListener() {
            String rail_in_Deb;
            String rail_in_Inter;
            String rail_in_Exp;
            String[] arr;

            @Override
            public void onClick(View v) {


                Spinner spinner_list_level = myActivity.getSpinnerLevel();
                if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                    arr=Deb.Rail();
                    rail_in_Deb =arr[0];
                    text_rail_in.setText(rail_in_Deb);

                }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        arr=Inter.Rail();
                        rail_in_Inter =arr[0];
                        text_rail_in.setText(rail_in_Inter);
                    }
                    else{
                        arr=Exp.Rail();
                        rail_in_Exp =arr[0];
                        text_rail_in.setText(rail_in_Exp);
                    }

                }

            }
        });
        but_rail_out.setOnClickListener(new View.OnClickListener() {
            String rail_out_Deb;
            String rail_out_Inter;
            String rail_out_Exp;
            String[] arr;

            @Override
            public void onClick(View v) {


                Spinner spinner_list_level = myActivity.getSpinnerLevel();
                if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                    arr=Deb.Rail();
                    rail_out_Deb=arr[1];
                    text_rail_out.setText(rail_out_Deb);
                }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        arr=Inter.Rail();
                        rail_out_Inter=arr[1];
                        text_rail_out.setText(rail_out_Inter);
                    }
                    else{
                        arr=Exp.Rail();
                        rail_out_Exp=arr[1];
                        text_rail_out.setText(rail_out_Exp);
                    }

                }

            }
        });

        return view;

    }
}
