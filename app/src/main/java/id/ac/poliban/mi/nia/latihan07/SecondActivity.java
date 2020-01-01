package id.ac.poliban.mi.nia.latihan07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //ubah title default pada action bar
        if(getSupportActionBar()!=null)
            getSupportActionBar().setTitle("SecocndActivity");
    }



}
