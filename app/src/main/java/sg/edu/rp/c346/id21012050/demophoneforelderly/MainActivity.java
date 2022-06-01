package sg.edu.rp.c346.id21012050.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button CallSon;
    Button CallDaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CallSon = findViewById(R.id.buttonCallSon);
        CallDaughter = findViewById(R.id.buttonCallDaughter);

        CallSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+92240336));
                startActivity(intentCall);
            }
        });

        CallDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+89675543));
                startActivity(intentCall);
            }
        });
    }
}