package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DiseasePreventionHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_prevention_home);

    public void anemia(View view) {
        Intent i1 = new Intent(this, Anemia01.class);

        startActivity(i1);

    }

    public void commonCold(View view) {
        Intent i2 = new Intent(this, Cold01.class);
        startActivity(i2);

    }

    public void hiv(View view) {
        Intent i3 = new Intent(this, HIV01.class);
        startActivity(i3);

    }

    public void typhoid(View view) {
        Intent i4 = new Intent(this, Typhoid01.class);
        startActivity(i4);

    }

    public void malaria(View view) {
        Intent i5 = new Intent(this, Malaria01.class);
        startActivity(i5);

    }

}
