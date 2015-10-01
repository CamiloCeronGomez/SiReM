package cf.app.camiloceron.com.sirem;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login, register;
    EditText usr, pass;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.btn_login);
        register = (Button) findViewById(R.id.btn_register);

        usr = (EditText) findViewById(R.id.edittxt_usr);
        pass = (EditText) findViewById(R.id.edittxt_pass);

        login.setOnClickListener(this);
        register.setOnClickListener(this);






    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login: break;
            case R.id.btn_register:
                Intent intent = new Intent (MainActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;


        }
    }
}
