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
 * Created by larnicol on 03/03/17.
 */

public class KickFragment extends Fragment{
    Debutant Deb;
    Intermediaire Inter;
    Expert Exp;
    Button but_trick;
    Button but_grab;
    TextView text_trick;
    TextView text_grab;

    MainActivity myActivity = null;

    private int mPage;

    public static KickFragment newInstance(int page) {
        Bundle args = new Bundle();
        KickFragment fragment = new KickFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /*
        Enfait la je prend l'activité qui contient ce fragment et je le cast en MainActivity. Je fais
        ca parceque dans MainActivity j'ai rajouté la fonction getSPinnerLevel, donc je dois bien
        avoir un objet MainActivity et pas seulement Activity.
         */
        myActivity = (MainActivity) getActivity();
        Deb=new Debutant(this.getContext());
        Inter=new Intermediaire(this.getContext());
        Exp=new Expert(this.getContext());
        View view = inflater.inflate(R.layout.fragment_kick, container, false);

        but_trick = (Button) view.findViewById(R.id.trick);
        text_trick = (TextView) view.findViewById(R.id.text_trick);
        but_grab=(Button) view.findViewById(R.id.grab);
        text_grab= (TextView) view.findViewById(R.id.text_grab);



        but_trick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String trick_Deb;
                String trick_Inter;
                String trick_Exp;
                Spinner spinner_list_level = myActivity.getSpinnerLevel();
                if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                    trick_Deb=Deb.Trick();
                    text_trick.setText(trick_Deb);
                }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        trick_Inter=Inter.Trick();
                        text_trick.setText(trick_Inter);
                    }
                    else{
                        trick_Exp=Exp.Trick();
                        text_trick.setText(trick_Exp);
                    }

                }

            }
        });
        but_grab.setOnClickListener(new View.OnClickListener() {
            String grab_Deb;
            String grab_Inter;
            String grab_Exp;
            Spinner spinner_list_level = myActivity.getSpinnerLevel();
            public void onClick(View v) {

                if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                    //DEBUTANT
                    grab_Deb=Deb.Grab();
                    text_grab.setText(grab_Deb);
                }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        //INTERMEDIAIRE
                        grab_Inter=Inter.Grab();
                        text_grab.setText(grab_Inter);
                    }
                    else{
                        //EXPERT
                        grab_Exp=Exp.Grab();
                        text_grab.setText(grab_Exp);
                    }

                }

            }
        });

                /*
                Je récupère la valeur de spinnerLevel. Le problème c'est que comme j'ai pas fais de
                callbak et tout le bordel, t'es obligé de faire cette ligne avant chaque fonction ou
                tu as besoin de spinner_list_level.
                C'est pas le plus optimisé, mais c'est le plus simple.
                 */






        return view;

    }
}
