package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Typhoid05 extends AppCompatActivity {

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
        setContentView(R.layout.activity_typhoid05);
    }public void typhoid01(View view) {
        Intent next = new Intent(this, Typhoid01.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);


    }

    public void typhoid02(View view) {
        Intent next = new Intent(this, Typhoid02.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);
    }

    public void typhoid03(View view) {
        Intent next = new Intent(this, Typhoid03.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);
    }

    public void typhoid04(View view) {
        Intent next = new Intent(this, Typhoid04.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);
    }

    public void typhoid05(View view) {
        Intent next = new Intent(this, Typhoid05.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);
    }



    public void diseaseHome(View view)
    {
        Intent home = new Intent(this,DiseasePreventionHome.class);
        startActivity(home);
    }
}
