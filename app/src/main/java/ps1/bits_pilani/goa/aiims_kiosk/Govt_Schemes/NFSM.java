package ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.pmsjby;
import ps1.bits_pilani.goa.aiims_kiosk.R;

public class NFSM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfsm);
    }
    public void nfsmp (View view) {
        Intent i = new Intent(this, PMJDY.class);
        startActivity(i);
    }
    public void nfsmn (View view) {
        Intent i = new Intent(this,IGMSY.class);
        startActivity(i);
    }
}
