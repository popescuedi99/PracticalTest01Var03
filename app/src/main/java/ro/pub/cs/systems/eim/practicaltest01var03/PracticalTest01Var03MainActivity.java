package ro.pub.cs.systems.eim.practicaltest01var03;

import android.view.View;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PracticalTest01Var03MainActivity extends AppCompatActivity {

    private EditText UpperText;
    private EditText LowerText;
    private Button plusButton, minusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UpperText = (EditText)findViewById(R.id.UpperText);
        LowerText = (EditText)findViewById(R.id.LowerText);

        plusButton = (Button)findViewById(R.id.plusButton);
        minusButton = (Button)findViewById(R.id.minusButton);

        UpperText.setText(String.valueOf(0));
        LowerText.setText(String.valueOf(0));
    }

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int firstText = Integer.valueOf(UpperText.getText().toString());
            int secondText = Integer.valueOf(UpperText.getText().toString());


        }
    }
}
