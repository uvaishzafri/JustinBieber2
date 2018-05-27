package com.humanetechnologies.UvaishZafri.justinbelieber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String you= extras.getString("me");
        TextView t=(TextView)findViewById(R.id.some);
        t.setText(""+you);
    }
}
