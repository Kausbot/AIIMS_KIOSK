package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Typhoid04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typhoid04);
    }public void typhoid01(View view) {
        Intent next = new Intent(this, Typhoid01.class);
        startActivity(next);


    }

    public void typhoid02(View view) {
        Intent next = new Intent(this, Typhoid02.class);
        startActivity(next);
    }

    public void typhoid03(View view) {
        Intent next = new Intent(this, Typhoid03.class);
        startActivity(next);
    }

    public void typhoid04(View view) {
        Intent next = new Intent(this, Typhoid04.class);
        startActivity(next);
    }

    public void typhoid05(View view) {
        Intent next = new Intent(this, Typhoid05.class);
        startActivity(next);
    }



    public void diseaseHome(View view)
    {
        Intent home = new Intent(this,DiseasePreventionHome.class);
        startActivity(home);
    }
}
