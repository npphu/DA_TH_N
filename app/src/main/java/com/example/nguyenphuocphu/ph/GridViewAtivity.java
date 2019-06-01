package com.example.nguyenphuocphu.ph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class GridViewAtivity extends AppCompatActivity {
    GridView gvChatVoco;
    Button btnClose;
    String[] ArChatVoco = {"Na","Ba","Ca","Br","H2","O2","Cu","Fe","Al","Zn","Hg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        btnClose = (Button) findViewById(R.id.btnClose);
        gvChatVoco = (GridView) findViewById(R.id.gvChatVoco);
        ArrayAdapter adapter = new ArrayAdapter(GridViewAtivity.this, android.R.layout.simple_list_item_1, ArChatVoco);
        gvChatVoco.setAdapter(adapter);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GridViewAtivity.this, MainActivity.class));
            }
        });

    }
}
