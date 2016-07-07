package ps1.bits_pilani.goa.aiims_kiosk;

import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MedicalTechnology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_technology);
        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable("#b91da4"));
    }
}
