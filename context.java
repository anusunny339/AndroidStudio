package com.example.sjcet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.sjcet.myapplication.R.menu.main_menu;

public class MainActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        registerForContextMenu(tv1);
       // registerForContextMenu(tv1);
    }


    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        //super.onCreateContextMenu(contextMenuInfo,view,menu);
        super.onCreateContextMenu(menu,view,contextMenuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(main_menu,menu);
      //  return true;

    }

    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()) {


            case R.id.ajay:
                Toast.makeText(this, "ajay", Toast.LENGTH_SHORT).show();
        }
       return super.onContextItemSelected(item);




    }

}
