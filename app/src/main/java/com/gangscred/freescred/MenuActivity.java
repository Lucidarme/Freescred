package com.gangscred.freescred;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by lucidarme on 03/03/17.
 */

public class MenuActivity extends Activity{
    Animation hyperspaceJumpAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        final View barre= findViewById(R.id.barre_menu);

        hyperspaceJumpAnimation= AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump);
        barre.startAnimation(hyperspaceJumpAnimation);



        findViewById(R.id.players).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(MenuActivity.this, Player.class);
                startActivity(intent1);
            }
        });

    }
}
