package sjec.tiara2019;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Events extends AppCompatActivity {

    private Button[] btn = new Button[4];
    private Button btn_unfocus;
    private int[] btn_id = {R.id.bcsebut, R.id.becebut};


    Button bcse,bece,beee;
    Fragment sfrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        sfrag=new csefragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.f_container,sfrag).commit();
        bcse=(Button)findViewById(R.id.bcsebut);
        bcse.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                sfrag=new csefragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.f_container,sfrag).commit();
                unclear();
                bcse.setTextColor(Color.RED);
            }
        });



        bece=(Button)findViewById(R.id.becebut);
        bece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sfrag=new ecefragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.f_container,sfrag).commit();
                unclear();
                bece.setTextColor(Color.CYAN);
            }
        });




      beee=(Button)findViewById(R.id.beeebut);
      beee.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              sfrag=new eeefragment();
              getSupportFragmentManager().beginTransaction().replace(R.id.f_container,sfrag).commit();
              unclear();
              beee.setTextColor(Color.BLUE);
          }
      });



    }

    private void unclear(){
        beee.setTextColor(Color.BLACK);
        bece.setTextColor(Color.BLACK);
        bcse.setTextColor(Color.BLACK);
    }

    public void ecevent1(View view){
        startActivity(new Intent(Events.this,Event_description.class));
    }
}
