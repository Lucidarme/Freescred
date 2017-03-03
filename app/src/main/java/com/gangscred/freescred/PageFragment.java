package com.gangscred.freescred;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by larnicol on 03/03/17.
 */

public class PageFragment extends Fragment{
    Debutant Deb;
    Button but_trick;
    TextView text_trick;
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Deb=new Debutant(this.getContext());
        View view = inflater.inflate(R.layout.fragment_kick, container, false);
       /* TextView textView = (TextView) view;
        textView.setText("Fragment #" + mPage); */
        

       /* but_trick.findViewById(R.id.trick);
        text_trick.findViewById(R.id.text_trick);


       but_trick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String trick_Deb="";
                if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                trick_Deb=Deb.Trick();
                text_trick.setText(Deb.Trick());
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
        });*/


        return view;

    }
}
