package com.gangscred.freescred;

import java.util.ArrayList;

/**
 * Created by larnicol on 27/02/17.
 */

public class Intermediaire {
    public String s_grab;
    private String s_grab_memoire="";
    private String s_rota_memoire="";
    private String s_trick_memoire="";
    public ArrayList<String> liste_trick_inter = new ArrayList<>();
    public ArrayList<String> liste_grab_inter = new ArrayList<>();
    public ArrayList<String> liste_rotation_inter = new ArrayList<>();
    public Intermediaire() {
        liste_trick_inter.add("");
        liste_trick_inter.add("switch");
        liste_trick_inter.add("back");
        liste_trick_inter.add("front");
        liste_trick_inter.add("flat");
        liste_trick_inter.add("bio");
        liste_trick_inter.add("cork");
        liste_trick_inter.add("misty");

        liste_rotation_inter.add("180");
        liste_rotation_inter.add("360");
        liste_rotation_inter.add("540");
        liste_rotation_inter.add("720");
        liste_rotation_inter.add("0");

        liste_grab_inter.add("No grab");
        liste_grab_inter.add("safety");
        liste_grab_inter.add("mute");
        liste_grab_inter.add("Kozak");
        liste_grab_inter.add("japan");
        liste_grab_inter.add("double japan");
        liste_grab_inter.add("tail");
        liste_grab_inter.add("blunt");
        liste_grab_inter.add("nose");

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
            if (s1 != "0" && (s_trick.equals("front") || s_trick.equals("back"))) {
                s_trick = liste_trick_inter.get((int) (Math.random() * liste_trick_inter.size()));
            }
            if(s_trick=="front" || s_trick=="back"){
                s2=s_trick;
                s_final=s2;
            }

            else {
                if((s_rotation=="180") && (s_trick=="cork" || s_trick=="misty" || s_trick=="flat" || s_trick=="bio")){
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


