package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Malaria03 extends AppCompatActivity {

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
        setContentView(R.layout.activity_malaria03);
    }public void malaria01(View view) {
        Intent next = new Intent(this, Malaria01.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);


    }

    public void malaria02(View view) {
        Intent next = new Intent(this, Malaria02.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);
    }

    public void malaria03(View view) {
        Intent next = new Intent(this, Malaria03.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);
    }

    public void malaria04(View view) {
        Intent next = new Intent(this, Malaria04.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);
    }

    public void malaria05(View view) {
        Intent next = new Intent(this, Malaria05.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);
    }

    public void malaria06(View view) {
        Intent next = new Intent(this, Malaria06.class);
        next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);startActivity(next);
    }

    public void diseaseHome(View view)
    {
        Intent home = new Intent(this,DiseasePreventionHome.class);
        startActivity(home);
    }
}
