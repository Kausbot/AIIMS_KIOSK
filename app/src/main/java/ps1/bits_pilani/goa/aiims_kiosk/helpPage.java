package ps1.bits_pilani.goa.aiims_kiosk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class helpPage extends AppCompatActivity {

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
        setContentView(R.layout.activity_help_page);
    }
}
