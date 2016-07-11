package ps1.bits_pilani.goa.aiims_kiosk;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View; import android.R;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final ActionBar actionBar = getActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.help_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.help) {

            Intent intent = new Intent(this, helpPage.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;


        }

        return super.onOptionsItemSelected(item);
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

    public void aboutAIIMS(View view) {
        Intent aA = new Intent(this, AboutAIIMS.class);
        startActivity(aA);
    }

    public void govt(View view) {
        Intent schemes = new Intent(this, Schemes.class);
        startActivity(schemes);
    }


}