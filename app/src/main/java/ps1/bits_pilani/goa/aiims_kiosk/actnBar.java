package ps1.bits_pilani.goa.aiims_kiosk;

import android.app.Activity;


        import android.app.ActionBar;
        import android.app.Activity;
        import android.os.Bundle;
        import android.view.KeyEvent;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.TextView.OnEditorActionListener;
        import android.widget.Toast;

public class actnBar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_contacts
        );

        ActionBar actionBar = getActionBar();
        // add the custom view to the action bar
        actionBar.setCustomView(R.layout.activity_actnbar);
        EditText search = (EditText) actionBar.getCustomView().findViewById(
                R.id.searchfield);
        search.setOnEditorActionListener(new OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId,
                                          KeyEvent event) {
                Toast.makeText(actnBar.this, "Search triggered",
                        Toast.LENGTH_LONG).show();
                return false;
            }
        });
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM
                | ActionBar.DISPLAY_SHOW_HOME);
    }

}