package com.example.administrator.text6;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
 public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    TextView textView;
    TextView tv1;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


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
        textView = (TextView) findViewById(R.id.textView);
        registerForContextMenu(textView);
        tv1=(TextView)findViewById(R.id.tv1);


    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
    }


    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.number:
                Toast.makeText(this, "学号", Toast.LENGTH_SHORT).show();
                break;
            case R.id.name:
                Toast.makeText(this, "姓名", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lay, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.in:
                Toast.makeText(this, "登录", Toast.LENGTH_SHORT).show();
                break;
            case R.id.up:
                Toast.makeText(this, "注册", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showPopup(View v)
    {
        PopupMenu popup = new PopupMenu(this, tv1);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_popup);
        popup.show();
    }

     public boolean onMenuItemClick(MenuItem menuItem) {
         switch (menuItem.getItemId()) {
             case R.id.name:
                 Toast.makeText(this, "姓名", Toast.LENGTH_SHORT).show();
                 break;
             case R.id.number:
                 Toast.makeText(this, "学号", Toast.LENGTH_SHORT).show();
                 break;
         }
         return false;
     }




 }

