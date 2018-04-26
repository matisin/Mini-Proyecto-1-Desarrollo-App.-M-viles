package com.piano.piano;

import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.view.View.generateViewId;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener, View.OnClickListener{
    private Piano piano;
    private ConstraintLayout layout;
    private static final String TAG = "MyActivity";

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);

        piano = new Piano();
        int n = piano.getSize();
        Button key;
        ConstraintSet set = new ConstraintSet();
        int parent_id = ConstraintSet.PARENT_ID;
        int anterior_id = parent_id;
        int id;
        for(int i = 0; i < n; i++){
            if(!piano.isBlack(i)){
                key = new Button(this);
                id = generateViewId();
                key.setId(id);
                key.setText(piano.getName(i));
                key.setGravity(Gravity.BOTTOM | Gravity.CENTER);

                layout.addView(key);

                set.constrainHeight(id, 0);

                set.constrainWidth(id,ConstraintSet.WRAP_CONTENT);
                set.constrainHeight(id, ConstraintSet.MATCH_CONSTRAINT);
                if(i == 0){
                    Log.v(TAG, "First");
                    set.connect(id, ConstraintSet.START,
                            anterior_id, ConstraintSet.START,0);
                }else{
                    Log.v(TAG, "Not First");
                    set.connect(id, ConstraintSet.START,
                            anterior_id, ConstraintSet.END,0);
                }
                set.connect(id, ConstraintSet.TOP,
                        parent_id, ConstraintSet.TOP,0);
                Log.v(TAG, "id=" + i+" anterior_id=" + anterior_id);
                anterior_id = id;

            }

        }
        set.applyTo(layout);


    }

    public void onPressedKey(View view, int pos){
        int res = piano.getNota(pos);
        MediaPlayer mp = MediaPlayer.create(this, res);
        mp.start();
        mp.setOnCompletionListener(this);
    }


    @Override
    public void onCompletion(MediaPlayer mp) {
        mp.release();
    }

    @Override
    public void onClick(View v) {

    }
}
