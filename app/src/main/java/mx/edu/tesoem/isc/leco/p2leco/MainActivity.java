package mx.edu.tesoem.isc.leco.p2leco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void siguiente(View v){
        Intent frm2kike = new Intent(this,frm2kike.class);
        startActivity(frm2kike);
        finish();
    }
    }

