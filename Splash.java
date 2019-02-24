package sjec.tiara2019;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    private TextView t1;
    private Animation animZoomout;
    Timer timer=new Timer();
    TimerTask timerTask;
    final Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        t1=(TextView)findViewById(R.id.name);
        animZoomout= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(animZoomout);
        setTimer();
    }
    public void setTimer(){
        timer=new Timer();
        initializedTimerTask();
        timer.schedule(timerTask,2000);
    }
    public void initializedTimerTask(){
        timerTask=new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(Splash.this,MainActivity.class));
                    }
                });
            }
        };
    }
}
