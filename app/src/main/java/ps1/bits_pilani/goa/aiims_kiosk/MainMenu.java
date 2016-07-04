package ps1.bits_pilani.goa.aiims_kiosk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int height1 = metrics.heightPixels;
        int width1 = metrics.widthPixels;


        ImageView iv = (ImageView) findViewById(R.id.diseasesAndPrevention);
        int width = 10;
        int height = 10;
        RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(width, height);
        iv.setLayoutParams(parms);
    }
}