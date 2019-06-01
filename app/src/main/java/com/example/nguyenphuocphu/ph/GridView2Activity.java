package com.example.nguyenphuocphu.ph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class GridView2Activity extends AppCompatActivity {

    GridView gvChatVoco;
    Button btnClose;
    String[] ArChatVoco = {"CH2=CH2","Br2","CH=CH","CH2OH","COONH4","C2H2","Cu","Fe","Al","Zn","Hg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view2);
        btnClose = (Button) findViewById(R.id.btnClose);
        gvChatVoco = (GridView) findViewById(R.id.gvChatVoco);
        ArrayAdapter adapter = new ArrayAdapter(GridView2Activity.this, android.R.layout.simple_list_item_1, ArChatVoco);
        gvChatVoco.setAdapter(adapter);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GridView2Activity.this, MainActivity.class));
            }
        });

    }
}
