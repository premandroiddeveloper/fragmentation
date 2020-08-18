package com.example.fragmentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements languagename.clicked {
TextView t1;
String k1[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.show);

         k1=getResources().getStringArray(R.array.features);
         if(findViewById(R.id.layout_portrait) !=null){
             FragmentManager mange=this.getSupportFragmentManager();
             mange.beginTransaction()
                     .show(Objects.requireNonNull(mange.findFragmentById(R.id.fragment)))
                     .hide(Objects.requireNonNull(mange.findFragmentById(R.id.fragment3)))
                     .commit();
         }
         if(findViewById(R.id.layout_land) !=null){
             FragmentManager mange=this.getSupportFragmentManager();
             mange.beginTransaction()
                     .show(Objects.requireNonNull(mange.findFragmentById(R.id.fragment)))
                     .show(Objects.requireNonNull(mange.findFragmentById(R.id.fragment3)))
                     .commit();
         }

    }
    public void fun(int id){
        t1.setText(k1[id]);
        if(findViewById(R.id.layout_portrait) !=null){
            FragmentManager mange=this.getSupportFragmentManager();
            mange.beginTransaction()
                    .show(Objects.requireNonNull(mange.findFragmentById(R.id.fragment3)))
                    .hide(Objects.requireNonNull(mange.findFragmentById(R.id.fragment)))
                    .addToBackStack(null)
                    .commit();
        }
    }
}