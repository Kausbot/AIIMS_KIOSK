package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


    }

    public void diseasesandPrevention(View view) {
        Intent dap = new Intent(this, DiseasePreventionHome.class);

        startActivity(dap);

    }

    public void medicalServices(View view) {
        Intent ms = new Intent(this, MedicalServices.class);

        startActivity(ms);

    }

    public void aboutUs(View view) {
        Intent au = new Intent(this, AboutUs.class);

        startActivity(au);

    }

    public void docContacts(View view) {
        Intent dC = new Intent(this, docContacts.class);

        startActivity(dC);

    }

    public void ambulatoryCare(View view) {
        Intent aC = new Intent(this, AmbulatoryCare.class);

        startActivity(aC);
    }

    public void maps(View view) {
        Intent maps = new Intent(this, Maps.class);

        startActivity(maps);
/** Intents of other tiles are to be added **/
    }
}