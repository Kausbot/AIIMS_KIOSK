package ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.jananiSuraksha;
import ps1.bits_pilani.goa.aiims_kiosk.PathologyAndLabMedicine;
import ps1.bits_pilani.goa.aiims_kiosk.R;

public class ICDS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icds);
    }
    public void icdsp (View view) {
        Intent i = new Intent(this,IGMSY.class);
        startActivity(i);
    }
    public void icdsn (View view) {
        Intent i = new Intent(this,jananiSuraksha.class);
        startActivity(i);
    }
}
