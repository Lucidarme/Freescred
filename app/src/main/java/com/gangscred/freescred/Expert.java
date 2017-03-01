package com.gangscred.freescred;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by larnicol on 27/02/17.
 */

public class Expert {
    public String s_grab;
    private String s_grab_memoire="";
    private String s_rota_memoire="";
    private String s_trick_memoire="";
    public ArrayList<String> liste_trick_exp = new ArrayList<>();
    public ArrayList<String> liste_grab_exp = new ArrayList<>();
    public ArrayList<String> liste_rotation_exp = new ArrayList<>();
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
    String rot_900;
    String rot_1080;

    String grab_mute;
    String grab_japan;
    String grab_cossak;
    String grab_safety;
    String grab_doublejap;
    String grab_tail;
    String grab_blunt;
    String grab_nose;
    String grab_truck;
    String grab_screamin;
    String grab_octo;
    String grab_leadtail;
    String grab_dubnose;





    public Expert(Context context) {
        this.context=context;
        String rot_0=context.getResources().getString(R.string.rot_0);
        String rot_180=context.getResources().getString(R.string.rot_180);
        String rot_360=context.getResources().getString(R.string.rot_360);
        String rot_540=context.getResources().getString(R.string.rot_540);
        String rot_720=context.getResources().getString(R.string.rot_720);
        String rot_900=context.getResources().getString(R.string.rot_900);
        String rot_1080=context.getResources().getString(R.string.rot_1080);

        String grab_mute=context.getResources().getString(R.string.grab_mute);
        String grab_japan=context.getResources().getString(R.string.grab_japan);
        String grab_cossak=context.getResources().getString(R.string.grab_cossak);
        String grab_safety=context.getResources().getString(R.string.grab_safety);
        String grab_doublejap=context.getResources().getString(R.string.grab_doublejapan);
        String grab_tail=context.getResources().getString(R.string.grab_tail);
        String grab_blunt=context.getResources().getString(R.string.grab_blunt);
        String grab_nose=context.getResources().getString(R.string.grab_nose);
        String grab_truck=context.getResources().getString(R.string.grab_truck);
        String grab_screamin=context.getResources().getString(R.string.grab_screaminseaman);
        String grab_octo=context.getResources().getString(R.string.grab_octo);
        String grab_leadtail=context.getResources().getString(R.string.grab_leadtail);
        String grab_dubnose=context.getResources().getString(R.string.grab_dubnose);

        String trick_front=context.getResources().getString(R.string.trick_front);
        String trick_misty=context.getResources().getString(R.string.trick_misty);
        String trick_back=context.getResources().getString(R.string.trick_back);
        String trick_cork=context.getResources().getString(R.string.trick_cork);
        String trick_rodeo=context.getResources().getString(R.string.trick_rodeo);
        String trick_droit=context.getResources().getString(R.string.trick_droit);
        String trick_flat=context.getResources().getString(R.string.trick_flat);

        liste_trick_exp.add(trick_droit);
        liste_trick_exp.add(trick_back);
        liste_trick_exp.add(trick_front);
        liste_trick_exp.add(trick_flat);
        liste_trick_exp.add(trick_rodeo);
        liste_trick_exp.add(trick_cork);
        liste_trick_exp.add(trick_misty);

        liste_rotation_exp.add(rot_0);
        liste_rotation_exp.add(rot_180);
        liste_rotation_exp.add(rot_360);
        liste_rotation_exp.add(rot_540);
        liste_rotation_exp.add(rot_720);
        liste_rotation_exp.add(rot_900);
        liste_rotation_exp.add(rot_1080);

        liste_grab_exp.add(grab_cossak);
        liste_grab_exp.add(grab_japan);
        liste_grab_exp.add(grab_safety);
        liste_grab_exp.add(grab_mute);
        liste_grab_exp.add(grab_doublejap);
        liste_grab_exp.add(grab_tail);
        liste_grab_exp.add(grab_blunt);
        liste_grab_exp.add(grab_nose);
        liste_grab_exp.add(grab_truck);
        liste_grab_exp.add(grab_dubnose);
        liste_grab_exp.add(grab_octo);
        liste_grab_exp.add(grab_screamin);
        liste_grab_exp.add(grab_leadtail);





    }

    //On crée le trick + rotation
    public String Trick(){
        String s1="";
        String s2="";
        String s_final="";
        String s_rotation = liste_rotation_exp.get((int) (Math.random() * liste_rotation_exp.size()));
        String s_trick = liste_trick_exp.get((int) (Math.random() * liste_trick_exp.size()));
        while (s1!=s_rotation) {
            if (s_rota_memoire!=s_rotation) {
                s1 = s_rotation;
                s_rota_memoire = s1;
                s_final=s1;
            } else {
                s_rotation = liste_rotation_exp.get((int) (Math.random() * liste_rotation_exp.size()));
            }
        }
        while (s2!=s_trick) {
            if (s1 !=rot_0 && (s_trick.equals(trick_front) || s_trick.equals(trick_back))) {
                s_trick = liste_trick_exp.get((int) (Math.random() * liste_trick_exp.size()));
            }
            if(s_trick==trick_front || s_trick==trick_back){
                s2=s_trick;
                s_final=s2;
            }

            else {
                if((s_rotation.equals(rot_180)) && (s_trick==trick_cork || s_trick==trick_misty || s_trick==trick_flat || s_trick==trick_rodeo)){
                    s_trick=liste_trick_exp.get((int) (Math.random()*liste_trick_exp.size()));
                }
                else{
                    if (s_trick_memoire != s_trick) {
                        s2 = s_trick;
                        s_trick_memoire = s2;
                        s_final=s2 + " " + s_final;
                    } else {
                        s_trick = liste_trick_exp.get((int) (Math.random() * liste_trick_exp.size()));
                    }
                }

            }
        }
        return(s_final);
    }
    public String Grab() {
        String sExcepExp="";
        while (sExcepExp != s_grab) {
            if (s_grab_memoire != s_grab) {
                sExcepExp = s_grab;
                s_grab_memoire = sExcepExp;
            } else {
                s_grab = liste_grab_exp.get((int) (Math.random() * liste_grab_exp.size()));
            }
        }
        return(s_grab);
    }
}
