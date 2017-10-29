package martic20.ximo1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private String yourName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Message send", Toast.LENGTH_LONG).show();
                TextView nom = (TextView) findViewById(R.id.tx_name);
                LinearLayout mg = (LinearLayout) findViewById(R.id.mg2);
                LinearLayout e = (LinearLayout) findViewById(R.id.enter_text);
                EditText input = (EditText) findViewById(R.id.in_name);
                yourName = input.getText().toString();
                nom.setText(input.getText());
                input.setText("");
                mg.setVisibility(view.VISIBLE);
                e.setVisibility(view.GONE);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "See you in a bit,"+yourName+"!", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "I'm happy to see you again "+ yourName+"!", Toast.LENGTH_LONG).show();
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_close) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
