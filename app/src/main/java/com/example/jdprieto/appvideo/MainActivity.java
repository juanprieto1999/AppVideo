package com.example.jdprieto.appvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.barra);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }
    public boolean onCreateOptionsItemsSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.borrar:
                Toast.makeText(this,"Has pulsado el menu borrar",Toast.LENGTH_SHORT).show();
                break;
            case R.id.editar:
                Toast.makeText(this,"Has pulsado el menu editar",Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                Toast.makeText(this,"Has pulsado la flechita chao",Toast.LENGTH_SHORT).show();
break;

        }


        return true;

    }


}
