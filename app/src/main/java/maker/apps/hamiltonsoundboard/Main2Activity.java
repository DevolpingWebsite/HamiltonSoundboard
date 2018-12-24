package maker.apps.hamiltonsoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    MediaPlayer mysound9;
    MediaPlayer mysound10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mysound9 = MediaPlayer.create(this, R.raw.herculesmulligan);
    }


    public void sound9 (View view) {mysound9.start(); }
}
