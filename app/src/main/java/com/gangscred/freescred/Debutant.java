package com.gangscred.freescred;



import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.text.method.HideReturnsTransformationMethod;

import java.util.ArrayList;

/**
 * Created by larnicol on 25/02/17.
 */


public class Debutant{
    public String s_grab;
    private String s_grab_memoire="";
    private String s_rota_memoire="";
    private String s_trick_memoire="";
    public  ArrayList<String> liste_trick_deb= new ArrayList<>();
    public ArrayList<String> liste_grab_deb= new ArrayList<>();
    public ArrayList<String> liste_rotation_deb= new ArrayList<>();
    private Context context;
    String trick_droit;

    String rot_0;
    String rot_180;
    String rot_360;

    String grab_mute;
    String grab_japan;
    String grab_cossak;
    String grab_safety;


    public Debutant(Context context) {
        this.context=context;
        String rot_0=context.getResources().getString(R.string.rot_0);
        String rot_180=context.getResources().getString(R.string.rot_180);
        String rot_360=context.getResources().getString(R.string.rot_360);
        String grab_nograb=context.getResources().getString(R.string.grab_nograb);
        String grab_mute=context.getResources().getString(R.string.grab_mute);
        String grab_japan=context.getResources().getString(R.string.grab_japan);
        String grab_cossak=context.getResources().getString(R.string.grab_cossak);
        String grab_safety=context.getResources().getString(R.string.grab_safety);

        // private String grab_cossak=getString(R.string.grab_cossak);
        liste_trick_deb.add("");
        liste_rotation_deb.add(rot_0);
        liste_rotation_deb.add(rot_180);
        liste_rotation_deb.add(rot_360);

        liste_grab_deb.add(grab_safety);
        liste_grab_deb.add(grab_mute);
        liste_grab_deb.add(grab_japan);



    }
    //On crée le trick + rotation
    public String Trick(){
        String s1="";
        String s2="";
        String s_final="";
        String s_rotation = liste_rotation_deb.get((int) (Math.random() * liste_rotation_deb.size()));
        String s_trick = liste_trick_deb.get((int) (Math.random() * liste_trick_deb.size()));
        while (s1!=s_rotation) {
            if (s_rota_memoire!=s_rotation) {
                s1 = s_rotation;
                s_rota_memoire = s1;
                s_final=s1;
            } else {
                s_rotation = liste_rotation_deb.get((int) (Math.random() * liste_rotation_deb.size()));
            }
        }
        while (s2!=s_trick) {
            if (s1 != "0" && (s_trick.equals("front") || s_trick.equals("back"))) {
                s_trick = liste_trick_deb.get((int) (Math.random() * liste_trick_deb.size()));
            }
            if(s_trick.equals("front") || s_trick.equals("back")){
                s2=s_trick;
                s_final=s2;
            }

            else {
                if((s_rotation.equals("180")) && (s_trick=="cork" || s_trick.equals("misty") || s_trick.equals("flat") || s_trick.equals("bio"))){
                    s_trick=liste_trick_deb.get((int) (Math.random()*liste_trick_deb.size()));
                }
                else{
                    if (s_trick_memoire != s_trick) {
                        s2 = s_trick;
                        s_trick_memoire = s2;
                        s_final=s2 + " " + s_final;
                    } else {
                        s_trick = liste_trick_deb.get((int) (Math.random() * liste_trick_deb.size()));
                    }
                }

            }
        }
        return(s_final);
    }

    //Crée le grab
    public String Grab(){

        String sExcepDeb="";
        while (sExcepDeb!=s_grab) {
            if (s_grab_memoire!=s_grab) {
                sExcepDeb = s_grab;
                s_grab_memoire = sExcepDeb;
            } else {
                s_grab = liste_grab_deb.get((int) (Math.random() * liste_grab_deb.size()));
            }
        }
        return s_grab;
    }



}

