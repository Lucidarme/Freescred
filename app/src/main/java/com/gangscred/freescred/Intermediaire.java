package com.gangscred.freescred;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by larnicol on 27/02/17.
 */

public class Intermediaire{
    public String s_grab;
    private String s_grab_memoire="";
    private String s_rota_memoire="";
    private String s_trick_memoire="";
    public ArrayList<String> liste_trick_inter = new ArrayList<>();
    public ArrayList<String> liste_grab_inter = new ArrayList<>();
    public ArrayList<String> liste_rotation_inter = new ArrayList<>();
    private Context context;

    String trick_front;
    String trick_misty;
    String trick_back;
    String trick_cork;
    String trick_rodeo;
    String trick_droit;
    String trick_flat;

    String rot_0;
    String rot_180;
    String rot_360;
    String rot_540;
    String rot_720;

    String grab_mute;
    String grab_japan;
    String grab_cossak;
    String grab_safety;
    String grab_doublejap;
    String grab_tail;
    String grab_blunt;
    String grab_nose;
    public Intermediaire(Context context){
        this.context=context;
        //ROTATIONS
        rot_0=context.getResources().getString(R.string.rot_0);
        rot_180=context.getResources().getString(R.string.rot_180);
        rot_360=context.getResources().getString(R.string.rot_360);
        rot_540=context.getResources().getString(R.string.rot_540);
        rot_720=context.getResources().getString(R.string.rot_720);
        //GRABS
        grab_mute=context.getResources().getString(R.string.grab_mute);
        grab_japan=context.getResources().getString(R.string.grab_japan);
        grab_cossak=context.getResources().getString(R.string.grab_cossak);
        grab_safety=context.getResources().getString(R.string.grab_safety);
        grab_doublejap=context.getResources().getString(R.string.grab_doublejapan);
        grab_tail=context.getResources().getString(R.string.grab_tail);
        grab_blunt=context.getResources().getString(R.string.grab_blunt);
        grab_nose=context.getResources().getString(R.string.grab_nose);
        //TRICKS
        trick_front=context.getResources().getString(R.string.trick_front);
        trick_misty=context.getResources().getString(R.string.trick_misty);
        trick_back=context.getResources().getString(R.string.trick_back);
        trick_cork=context.getResources().getString(R.string.trick_cork);
        trick_rodeo=context.getResources().getString(R.string.trick_rodeo);
        trick_droit=context.getResources().getString(R.string.trick_droit);
        trick_flat=context.getResources().getString(R.string.trick_flat);


        liste_trick_inter.add(trick_droit);
        liste_trick_inter.add(trick_back);
        liste_trick_inter.add(trick_front);
        liste_trick_inter.add(trick_flat);
        liste_trick_inter.add(trick_rodeo);
        liste_trick_inter.add(trick_cork);
        liste_trick_inter.add(trick_misty);


        liste_rotation_inter.add(rot_0);
        liste_rotation_inter.add(rot_180);
        liste_rotation_inter.add(rot_360);
        liste_rotation_inter.add(rot_540);
        liste_rotation_inter.add(rot_720);


        liste_grab_inter.add(grab_cossak);
        liste_grab_inter.add(grab_japan);
        liste_grab_inter.add(grab_safety);
        liste_grab_inter.add(grab_mute);
        liste_grab_inter.add(grab_doublejap);
        liste_grab_inter.add(grab_tail);
        liste_grab_inter.add(grab_blunt);
        liste_grab_inter.add(grab_nose);

    }
    //On crée le trick + rotation
    public String Trick(){
        String s1="";
        String s2="";
        String s_final="";
        String s_rotation = liste_rotation_inter.get((int) (Math.random() * liste_rotation_inter.size()));
        String s_trick = liste_trick_inter.get((int) (Math.random() * liste_trick_inter.size()));
        while (s1!=s_rotation) {
            if (s_rota_memoire!=s_rotation) {
                s1 = s_rotation;
                s_rota_memoire = s1;
                s_final=s1;
            } else {
                s_rotation = liste_rotation_inter.get((int) (Math.random() * liste_rotation_inter.size()));
            }
        }
        while (s2!=s_trick) {

            if(s_trick.equals(trick_front )|| s_trick.equals(trick_back)){
                s2=s_trick;
                s_final=s2;
            }

            else {
                Log.d("TAG","rot_180 = " + rot_180 + " s_trick = " + s_trick);
                if((s_rotation.equals(rot_180) || s_rotation.equals(rot_0)) && (s_trick.equals(trick_cork )|| s_trick.equals(trick_misty )|| s_trick.equals(trick_flat )|| s_trick.equals(trick_rodeo))){
                    s_trick=liste_trick_inter.get((int) (Math.random()*liste_trick_inter.size()));
                }
                else{
                    if (s_trick_memoire != s_trick) {
                        s2 = s_trick;
                        s_trick_memoire = s2;
                        s_final=s2 + " " + s_final;
                    } else {
                        s_trick = liste_trick_inter.get((int) (Math.random() * liste_trick_inter.size()));
                    }
                }

            }
        }
        return(s_final);
    }

        public String Grab(){

            String sExcepInter="";
            while (sExcepInter!=s_grab) {
                if (s_grab_memoire!=s_grab) {
                    sExcepInter = s_grab;
                    s_grab_memoire = sExcepInter;
                } else {
                    s_grab = liste_grab_inter.get((int) (Math.random() * liste_grab_inter.size()));
                }
            }
            return s_grab;
        }



}


