package ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.R;
import ps1.bits_pilani.goa.aiims_kiosk.Schemes;

public class IGMSY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igmsy);
    }
    public void igmsyp (View view) {
        Intent i = new Intent(this,NFSM.class);
        startActivity(i);
    }
    public void igmsyn (View view) {
        Intent i = new Intent(this,ICDS.class);
        startActivity(i);
    }
    public void igmsyh (View view) {
        Intent i = new Intent(this,Schemes.class);
        startActivity(i);
    }
}
