package sjec.tiara2019;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button eventb,schedb,faqb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventb=(Button)findViewById(R.id.event_but);
        schedb=(Button)findViewById(R.id.schedule_but);
        faqb=(Button)findViewById(R.id.FAQ_but);
        eventb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eventb.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });


        schedb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            schedb.setBackgroundColor(getResources().getColor(R.color.yellow));
        }
    });

            faqb.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        faqb.setBackgroundColor(getResources().getColor(R.color.yellow));

    startActivity(new Intent(MainActivity.this,FAQ.class));
    faqb.setBackgroundResource(R.drawable.outlinebutton);
        }
        });
        }



}
