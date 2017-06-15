package com.lux.imr.welcomeaboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.lux.imr.welcomeaboard.menuOptions.Email;
import com.lux.imr.welcomeaboard.menuOptions.Home;

public class MainActivity extends AppCompatActivity {

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
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        //
        MenuItem item = menu.findItem(R.id.action_LogOut);
        SpannableStringBuilder builder = new SpannableStringBuilder("* LogOut");
        // replace "*" with icon
        builder.setSpan(new ImageSpan(this, R.drawable.ic_action_logout), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        item.setTitle(builder);
        return true;
    }



    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/
        switch (id)
        {
            case R.id.action_settings:
            {
                Toast.makeText(MainActivity.this,"You have selected the settings menu",
                        Toast.LENGTH_LONG).show();
                break;
            }case R.id.action_Search:
        {

            Toast.makeText(MainActivity.this,"You have selected the Search menu",
                    Toast.LENGTH_LONG).show();
            break;
        }case R.id.action_Help:
        {
            Toast.makeText(MainActivity.this,"You Need Help...?",
                    Toast.LENGTH_LONG).show();
            break;
        }
            case R.id.action_MyInfo:
            {
                Toast.makeText(MainActivity.this,"Please Enter the Form",
                        Toast.LENGTH_LONG).show();
                /*Intent myIntent=new Intent(MainActivity.this,Email.class);
                MainActivity.this.startActivity(myIntent);*/
                break;
            }
            case R.id.action_myemail:
            {
                Toast.makeText(MainActivity.this,"WelcomeTOEmail",
                        Toast.LENGTH_LONG).show();
                Intent myIntent=new Intent(MainActivity.this,Email.class);
                MainActivity.this.startActivity(myIntent);
                break;
            }
            case R.id.action_Home:
            {
                Toast.makeText(MainActivity.this,"You Need Help...?",
                        Toast.LENGTH_LONG).show();
                Intent myIntent=new Intent(MainActivity.this,Home.class);
                MainActivity.this.startActivity(myIntent);
                break;
            }

        }

        return super.onOptionsItemSelected(item);
    }
}
