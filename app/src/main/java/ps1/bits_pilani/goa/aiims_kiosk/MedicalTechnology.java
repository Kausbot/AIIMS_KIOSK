package ps1.bits_pilani.goa.aiims_kiosk;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MedicalTechnology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_technology);
        String color="#b91da4";
        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable());


    }
    public void pathology (View view) {
        Intent i = new Intent(this,PathologyAndLabMedicine.class);
        startActivity(i);
    }
    public void ambcare (View view) {
        Intent i = new Intent(this,AmbulatoryCare.class);
        startActivity(i);
    }
    }

