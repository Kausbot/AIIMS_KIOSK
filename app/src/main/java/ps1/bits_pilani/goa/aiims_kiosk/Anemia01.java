package ps1.bits_pilani.goa.aiims_kiosk;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Anemia01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_anemia01);


    }

    public void anemia01(View view) {
        Intent next = new Intent(this, Anemia01.class);
        startActivity(next);


    }

    public void anemia02(View view) {
        Intent next = new Intent(this, Anemia02.class);
        startActivity(next);
    }

    public void anemia03(View view) {
        Intent next = new Intent(this, anemia03.class);
        startActivity(next);
    }

    public void anemia04(View view) {
        Intent next = new Intent(this, Anemia04.class);
        startActivity(next);
    }

    public void anemia05(View view) {
        Intent next = new Intent(this, Anemia05.class);
        startActivity(next);
    }

    public void anemia06(View view) {
        Intent next = new Intent(this, Anemia06.class);
        startActivity(next);
    }

    public void diseaseHome(View view)
    {
        Intent home = new Intent(this,DiseasePreventionHome.class);
        startActivity(home);
    }


}