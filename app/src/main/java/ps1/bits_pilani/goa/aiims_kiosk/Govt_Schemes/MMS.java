package ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ps1.bits_pilani.goa.aiims_kiosk.jananiSuraksha;
import ps1.bits_pilani.goa.aiims_kiosk.pmsjby;
import ps1.bits_pilani.goa.aiims_kiosk.R;

public class MMS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mms);
    }
    public void mmsp (View view) {
        Intent i = new Intent(this, jananiSuraksha.class);
        startActivity(i);
    }
    public void mmsn (View view) {
        Intent i = new Intent(this, PMJJBY.class);
        startActivity(i);
    }
}
