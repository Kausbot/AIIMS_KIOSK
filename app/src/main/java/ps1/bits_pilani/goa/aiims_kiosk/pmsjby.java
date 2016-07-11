package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.MMS;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.PMJJBY;

public class pmsjby extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmsjby);
    }
    public void pmsjbyp (View view) {
        Intent i = new Intent(this,MMS.class);
        startActivity(i);
    }
    public void pmsjbyh (View view) {
        Intent i = new Intent(this,Schemes.class);
        startActivity(i);
    }
    public void pmsjbyn (View view) {
        Intent i = new Intent(this,PMJJBY.class);
        startActivity(i);
    }
}
