package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; import android.R;

public class Cold02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        setContentView(R.layout.activity_cold02);
    }

    public void cold01(View view) {
        Intent next = new Intent(this, Cold01.class);
        startActivity(next);


    }

    public void cold02(View view) {
        Intent next = new Intent(this, Cold02.class);
        startActivity(next);
    }

    public void cold03(View view) {
        Intent next = new Intent(this, Cold03.class);
        startActivity(next);
    }

    public void cold04(View view) {
        Intent next = new Intent(this, Cold04.class);
        startActivity(next);
    }

    public void cold05(View view) {
        Intent next = new Intent(this, Cold05.class);
        startActivity(next);
    }



    public void diseaseHome(View view)
    {
        Intent home = new Intent(this,DiseasePreventionHome.class);
        startActivity(home);
    }

}
