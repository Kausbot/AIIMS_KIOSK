package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.ICDS;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.IGMSY;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.JSY;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.MMS;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.NFSM;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.PMJDY;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.PMJJBY;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.PMSBY;

public class Schemes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);
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
        Intent pmsby = new Intent(this, PMSBY.class);

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