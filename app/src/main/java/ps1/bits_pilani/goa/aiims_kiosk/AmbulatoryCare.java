package ps1.bits_pilani.goa.aiims_kiosk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


public class AmbulatoryCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview= (TextView) findViewById(R.id.your_textview_id);
        textview.setMovementMethod(new ScrollingMovementMethod());
        setContentView(R.layout.activity_ambulatory_care);
    }
}
