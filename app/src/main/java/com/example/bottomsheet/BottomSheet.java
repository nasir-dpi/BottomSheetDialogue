package com.example.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BottomSheet extends AppCompatActivity {

    private Button buttonclicked;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);

        buttonclicked = (Button)findViewById(R.id.button_clicked);
        buttonclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetClass bottomSheet = new BottomSheetClass();
                bottomSheet.show(getSupportFragmentManager(),"bottomSheetClass");
            }
        });
    }
}
