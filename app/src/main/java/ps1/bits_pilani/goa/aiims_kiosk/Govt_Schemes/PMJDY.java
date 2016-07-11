package ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.PathologyAndLabMedicine;
import ps1.bits_pilani.goa.aiims_kiosk.R;
import ps1.bits_pilani.goa.aiims_kiosk.Schemes;

public class PMJDY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmjdy);
    }
    public void pmjd (View view) {
        Intent i = new Intent(this,PMJJBY.class);
        startActivity(i);
    }
    public void pmjdyn (View view) {
        Intent i = new Intent(this,NFSM.class);
        startActivity(i);
    }
    public void pmjdyh (View view) {
        Intent i = new Intent(this,Schemes.class);
        startActivity(i);
    }
}
