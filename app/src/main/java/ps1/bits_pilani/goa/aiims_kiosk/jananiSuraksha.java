package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.ICDS;
import ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes.MMS;

public class jananiSuraksha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janani_suraksha);
    }
    public void jsyp (View view) {
        Intent i = new Intent(this, ICDS.class);
        startActivity(i);
    }
    public void jsyn (View view) {
        Intent i = new Intent(this,MMS.class);
        startActivity(i);
    }
}
