package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; import android.R;

public class HIV02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        setContentView(R.layout.activity_hiv02);
    }
    public void hiv01(View view) {
        Intent next = new Intent(this, HIV01.class);
        startActivity(next);


    }

    public void hiv02(View view) {
        Intent next = new Intent(this, HIV02.class);
        startActivity(next);
    }

    public void hiv03(View view) {
        Intent next = new Intent(this, HIV03.class);
        startActivity(next);
    }

    public void hiv04(View view) {
        Intent next = new Intent(this, HIV04.class);
        startActivity(next);
    }

    public void hiv05(View view) {
        Intent next = new Intent(this, HIV05.class);
        startActivity(next);
    }

    public void hiv06(View view) {
        Intent next = new Intent(this, HIV06.class);
        startActivity(next);
    }

    public void diseaseHome(View view)
    {
        Intent home = new Intent(this,DiseasePreventionHome.class);
        startActivity(home);
    }
}
