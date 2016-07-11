package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.IGMSY;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.NFSM;

public class rntcp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rntcp);
    }
    public void rntcpp (View view) {
        Intent i = new Intent(this,NFSM.class);
        startActivity(i);
    }
    public void rntcpn (View view) {
        Intent i = new Intent(this,IGMSY.class);
        startActivity(i);
    }
    public void rntcph (View view) {
        Intent i = new Intent(this,Schemes.class);
        startActivity(i);
    }
}
