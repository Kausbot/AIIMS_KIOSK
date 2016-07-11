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
    public void clinical (View view) {
        Intent i = new Intent(this,ClinicalBioChem.class);
        startActivity(i);
    }
    public void entt (View view) {
        Intent i = new Intent(this,ENT.class);
        startActivity(i);
    }
    public void genmed (View view) {
        Intent i = new Intent(this,GeneralMedicine.class);
        startActivity(i);
    }
    public void neuro (View view) {
        Intent i = new Intent(this,NeurologynFamilyMedicine.class);
        startActivity(i);
    }
    public void radio (View view) {
        Intent i = new Intent(this,RadiologynPulmonary.class);
        startActivity(i);
    }
    public void micro (View view) {
        Intent i = new Intent(this,Microbiology.class);
        startActivity(i);
    }
    public void pedea (View view) {
        Intent i = new Intent(this,PediatricsNOBGY.class);
        startActivity(i);
    }
    public void dent (View view) {
        Intent i = new Intent(this,DentistryNPsychiatry.class);
        startActivity(i);
    }
    }

