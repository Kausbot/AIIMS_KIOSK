package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MedicalServices extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_services);
        toolbar = (Toolbar) findViewById(R.id.ms_tool_bar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void ambcare (View view) {
        Intent i = new Intent(this,AmbulatoryCare.class);
        startActivity(i);
    }

    public void famcare (View view) {
        Intent i = new Intent(this,OutReachFamilyCare.class);
        startActivity(i);
    }
    public void ambcare (View view) {
        Intent i = new Intent(this,AmbulatoryCare.class);
        startActivity(i);
    }
    public void acute (View view) {
        Intent i = new Intent(this,AcuteCar.class);
        startActivity(i);
    }
    public void long (View view) {
        Intent i = new Intent(this,LongTermChronicCare.class);
        startActivity(i);
    }
    public void surgical (View view) {
        Intent i = new Intent(this,SurgicalOperations.class);
        startActivity(i);
    }
}

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if(id== R.id.home)
        {

            Intent intent = new Intent(this, MainMenu.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}*/
