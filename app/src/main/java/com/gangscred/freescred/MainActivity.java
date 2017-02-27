package com.gangscred.freescred;

import android.location.GpsStatus;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    Button but_trick;
    Button but_grab;
    TextView text_trick;
    TextView text_grab;
    String s_grab_memoire="";
    String s_trick_memoire="";
    String s_rotation_memoire="";
    private Spinner spinner_list_level=null;

    //On crée nos 3 objets contenant les listes des différents niveaux
    Debutant Deb=new Debutant();
    Intermediaire Inter = new Intermediaire();
    Expert Exp = new Expert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        spinner_list_level=(Spinner) findViewById(R.id.spinner_level);
       // level= spinner_list_level.getSelectedItem().toString();
        spinner_list_level.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //On définit nos boutons, text

        but_trick = (Button) findViewById(R.id.trick);
        but_grab = (Button) findViewById(R.id.grab);
        text_trick = (TextView) findViewById(R.id.text_trick);
        text_grab = (TextView) findViewById(R.id.text_grab);

        //évènements
        but_trick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  String s1="";
                String s2="";
                String s_final="";
                String s_rotation = tab_final_rotation.get((int) (Math.random() * tab_final_rotation.size()));
                String s_trick = tab_final_trick.get((int) (Math.random() * tab_final_trick.size()));
                while (s1!=s_rotation) {
                    if (s_rota_memoire!=s_rotation) {
                        s1 = s_rotation;
                        s_rota_memoire = s1;
                        s_final=s1;
                    } else {
                        s_rotation = tab_final_rotation.get((int) (Math.random() * tab_final_rotation.size()));
                    }
                }
                while (s2!=s_trick) {
                    if (s1 != "0" && (s_trick.equals("front") || s_trick.equals("back"))) {
                        s_trick = tab_final_trick.get((int) (Math.random() * tab_final_trick.size()));
                    }
                    if(s_trick=="front" || s_trick=="back"){
                        s2=s_trick;
                        s_final=s2;
                    }

                    else {
                        if((s_rotation=="180") && (s_trick=="cork" || s_trick=="misty" || s_trick=="flat" || s_trick=="bio")){
                            s_trick=tab_final_trick.get((int) (Math.random()*tab_final_trick.size()));
                        }
                        else{
                            if (s_trick_memoire != s_trick) {
                                s2 = s_trick;
                                s_trick_memoire = s2;
                                s_final=s2 + " " + s_final;
                            } else {
                                s_trick = tab_final_trick.get((int) (Math.random() * tab_final_trick.size()));
                            }
                        }

                    }
                }
           text_trick.setText(s_final); */
                String trick_Deb="";
                String trick_Inter="";
                String trick_Exp="";
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
            @Override
            public void onClick(View v) {
                String grab_Deb;
                String grab_Inter;
                String grab_Exp;
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
    }
}
