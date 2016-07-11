package ps1.bits_pilani.goa.aiims_kiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View; import android.R;

import java.util.function.ToLongBiFunction;

public class DiseasePreventionHome extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_prevention_home);

        toolbar = (Toolbar) findViewById(R.id.dap_tool_bar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if(id== R.id.home)
        {

            Intent intent = new Intent(this, MainMenu.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
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

    public void mainmenu(View view)
    {
        Intent i6 = new Intent(this,MainMenu.class);
        startActivity(i6);

    }
}
