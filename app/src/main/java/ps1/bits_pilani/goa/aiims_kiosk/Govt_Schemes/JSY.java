package ps1.bits_pilani.goa.aiims_kiosk.Govt_Schemes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ps1.bits_pilani.goa.aiims_kiosk.R;

public class JSY extends AppCompatActivity {

    @Override
    protected void onPause() {
        super.onPause();
        this.finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsy);
    }
}
