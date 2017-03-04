package com.gangscred.freescred;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by larnicol on 03/03/17.
 */

public class PageFragment extends Fragment{
    Debutant Deb;
    Intermediaire Inter;
    Expert Exp;
    Button but_trick;
    TextView text_trick;


    private int mPage;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        PageFragment fragment = new PageFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Deb=new Debutant(this.getContext());
        Inter=new Intermediaire(this.getContext());
        Exp=new Expert(this.getContext());
        View view = inflater.inflate(R.layout.fragment_kick, container, false);

        but_trick = (Button) view.findViewById(R.id.trick);
        text_trick = (TextView) view.findViewById(R.id.text_trick);



       but_trick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


              /*  if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                String trick_Deb=Deb.Trick();
                text_trick.setText(Deb.Trick());
                }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        String trick_Inter=Inter.Trick();
                        text_trick.setText(trick_Inter);
                    }
                    else{
                        String trick_Exp=Exp.Trick();
                        text_trick.setText(trick_Exp);
                    }

                } */

            }
        });


        return view;

    }
}
