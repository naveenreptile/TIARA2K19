package sjec.tiara2019;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FAQ extends AppCompatActivity {

    private Button[] btn = new Button[4];
    private Button btn_unfocus;
    private int[] btn_id = {R.id.bcsebut, R.id.becebut};


    Button bcse,bece;
    Fragment sfrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);






        sfrag=new csefragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.f_container,sfrag).commit();
        bcse=(Button)findViewById(R.id.bcsebut);
        bcse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sfrag=new csefragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.f_container,sfrag).commit();
                unclear();
                bcse.setBackgroundResource(R.color.yellow);
            }
        });



        bece=(Button)findViewById(R.id.becebut);
        bece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sfrag=new ecefragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.f_container,sfrag).commit();
                unclear();
                bece.setBackgroundResource(R.color.yellow);
            }
        });








    }

    private void unclear(){
        bcse.setBackgroundResource(R.drawable.outlinebuttonnew);
        bece.setBackgroundResource(R.drawable.outlinebuttonnew);
    }
}
