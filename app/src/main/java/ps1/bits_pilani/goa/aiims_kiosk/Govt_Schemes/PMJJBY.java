package ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.PathologyAndLabMedicine;
import ps1.bits_pilani.goa.aiims_kiosk.Schemes;
import ps1.bits_pilani.goa.aiims_kiosk.pmsjby;
import ps1.bits_pilani.goa.aiims_kiosk.R;

public class PMJJBY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmjjby);
    }
    public void pmjjbyp (View view) {
        Intent i = new Intent(this, pmsjby.class);
        startActivity(i);
    }
    public void pmjjbyn (View view) {
        Intent i = new Intent(this,PMJDY.class);
        startActivity(i);
    }
    public void pmjjbyh (View view) {
        Intent i = new Intent(this,Schemes.class);
        startActivity(i);
    }
}
