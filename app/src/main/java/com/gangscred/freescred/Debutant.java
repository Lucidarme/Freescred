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
    private String s_rail_memoire="";
    public  ArrayList<String> liste_trick_deb= new ArrayList<>();
    public ArrayList<String> liste_grab_deb= new ArrayList<>();
    public ArrayList<String> liste_rotation_deb= new ArrayList<>();
    public  ArrayList<String>rail_on= new ArrayList<>();
    public ArrayList<String>rail_in= new ArrayList<>();
    public ArrayList<String>rail_out= new ArrayList<>();
    private Context context;


    String rot_0;
    String rot_180;
    String rot_360;

    String grab_mute;
    String grab_japan;
    String grab_cossak;
    String grab_safety;
    String grab_nograb;

    String in_50_50;
    String in_onefoot;
    String in_90;
    String in_27;
    String in_45;
    String in_63;
    String in_180;

    String out_switch;
    String out_forward;
    String out_27front;
    String out_27back;
    String out_45front;
    String out_45back;
    String out_63front;
    String out_63back;
    String out_misty;

    String on_frontswap;
    String on_backswap;
    String on_frontswap360;
    String on_backswap360;

    public Debutant(Context context) {
        this.context=context;
        rot_0=context.getResources().getString(R.string.rot_0);
        rot_180=context.getResources().getString(R.string.rot_180);
        rot_360=context.getResources().getString(R.string.rot_360);
        grab_nograb=context.getResources().getString(R.string.grab_nograb);
        grab_mute=context.getResources().getString(R.string.grab_mute);
        grab_japan=context.getResources().getString(R.string.grab_japan);
        grab_cossak=context.getResources().getString(R.string.grab_cossak);
        grab_safety=context.getResources().getString(R.string.grab_safety);
        in_90=context.getResources().getString(R.string.in_90);
        in_180=context.getResources().getString(R.string.in_180);
        out_27front =context.getResources().getString(R.string.out_27front);
        out_27back =context.getResources().getString(R.string.out_27back);
        out_switch=context.getResources().getString(R.string.out_switch);
        out_forward=context.getResources().getString(R.string.out_forward);


        // private String grab_cossak=getString(R.string.grab_cossak);
        liste_trick_deb.add("");
        liste_rotation_deb.add(rot_0);
        liste_rotation_deb.add(rot_180);
        liste_rotation_deb.add(rot_360);

        liste_grab_deb.add(grab_safety);
        liste_grab_deb.add(grab_mute);
        liste_grab_deb.add(grab_japan);

        rail_in.add(in_90);
        rail_in.add(in_180);
        rail_out.add(out_switch);
        rail_out.add(out_forward);
        rail_out.add(out_27front);
        rail_out.add(out_27back);





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
    String rail_in_mem="";
    String rail_out_mem="";
    public String[] Rail(){
        String s1="";
        String s2="";
        String s_in_final="";
        String s_out_final="";
        String s_in = rail_in.get((int) (Math.random() * rail_in.size()));
        String s_out = rail_out.get((int) (Math.random() * rail_out.size()));
        while (s1!=s_in) {
            if (rail_in_mem!=s_in) {
                s1 = s_in;
                rail_in_mem = s1;
                s_in_final=s1;
            } else {
                s_in = rail_in.get((int) (Math.random() *rail_in.size()));
            }
        }
        while (s2!=s_out) {
            if (rail_out_mem!=s_out) {
                s2 = s_out;
                rail_out_mem = s2;
                s_out_final=s2;
            } else {
                s_out = rail_out.get((int) (Math.random() *rail_out.size()));
            }
        }
        String[] arr = new String[2];
        arr[0] = s_in_final;
        arr[1] = s_out_final;
        return arr;
    }
}





