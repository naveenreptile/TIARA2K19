package sjec.tiara2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Event_description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_description);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Code Sense");

    }

    public void gowebpage(View view){
        startActivity(new Intent(Event_description.this,Registration.class));
    }
}
