package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.ICDS;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.IGMSY;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.JSY;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.MMS;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.NFSM;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.PMJDY;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.PMJJBY;

public class Schemes extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);

        toolbar = (Toolbar) findViewById(R.id.govt_tool_bar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {

            Intent intent = new Intent(this, MainMenu.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;


        }

        return super.onOptionsItemSelected(item);
    }



    public void IGMSY(View view) {
        Intent imgsy = new Intent(this, IGMSY.class);

        startActivity(imgsy);

    }
    public void ICDS(View view) {
        Intent icds = new Intent(this, ICDS.class);

        startActivity(icds);

    }

    public void JSY(View view) {
        Intent jsy = new Intent(this, JSY.class);

        startActivity(jsy);

    }

    public void MMS(View view) {
        Intent mms = new Intent(this, MMS.class);

        startActivity(mms);

    }

    public void PMJDY(View view) {
        Intent pmjdy = new Intent(this, PMJDY.class);

        startActivity(pmjdy);

    }

    public void PMSBY(View view) {
        Intent pmsby = new Intent(this, pmsjby.class);

        startActivity(pmsby);

    }

    public void PMJJBY(View view) {
        Intent pmjjby = new Intent(this, PMJJBY.class);

        startActivity(pmjjby);

    }

    public void NFSM(View view) {
        Intent nfsm = new Intent(this, NFSM.class);

        startActivity(nfsm);

    }
}