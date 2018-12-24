package maker.apps.hamiltonsoundboard;



import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import static maker.apps.hamiltonsoundboard.R.raw.peggy;

public class MainActivity extends AppCompatActivity {



    MediaPlayer mysound1;
    MediaPlayer mysound2;
    MediaPlayer mysound3;
    MediaPlayer mysound4;
    MediaPlayer mysound5;
    MediaPlayer mysound6;
    MediaPlayer mysound7;
    MediaPlayer mysound8;
    MediaPlayer mysound9;
    MediaPlayer mysound10;
    ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysound1 = MediaPlayer.create(this, R.raw.aaronburrsir);
        mysound2 = MediaPlayer.create(this, R.raw.angelica);
        mysound3 = MediaPlayer.create(this, R.raw.hi);
        mysound4 = MediaPlayer.create(this, R.raw.iknowwheretofindyou);
        mysound5 = MediaPlayer.create(this, R.raw.alexamilton);
        mysound6 = MediaPlayer.create(this, R.raw.peggy);
        mysound7 = MediaPlayer.create(this, R.raw.eliza);
        mysound8 = MediaPlayer.create(this, R.raw.sister);
    }


    public void sound1(View view) {
        mysound1.start();
    }

    public void sound2(View view) {
        mysound2.start();
    }

    public void sound3(View view) {
        mysound3.start();
    }

    public void sound4(View view) {
        mysound4.start();
    }

    public void sound5(View view) {
        mysound5.start();
    }

    public void sound6(View view) {
        mysound6.start();
    }

    public void sound7(View view) {
        mysound7.start();
    }

    public void sound8(View view) {
        mysound8.start();
    }
}