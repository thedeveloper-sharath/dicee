package com.sharathprakaksh.dicee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int homerun = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] imagearray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        Button rollbutton = findViewById(R.id.roll_button);
        final ImageView dice1 = findViewById(R.id.dice1);
        final ImageView dice2 = findViewById(R.id.dice2);

        final TextView message = findViewById(R.id.message);
        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Log.d("Dicee", "The button has been pressed");
                Toast.makeText(MainActivity.this, "Yeyyy", Toast.LENGTH_LONG).show();
                Builder builder = new Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle("Roll button response")
                        .setContentText("The button works")
                        .setPriority(NotificationCompat.PRIORITY_HIGH);
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(0, builder.build());*/
                Random randomnumbergenerator = new Random();

                int number1 = randomnumbergenerator.nextInt(6);

                int number = randomnumbergenerator.nextInt(6);

//                Toast.makeText(MainActivity.this, "the random number is " + number, Toast.LENGTH_SHORT).show();
                dice1.setImageResource(imagearray[number]);
                dice2.setImageResource(imagearray[number1]);

                if (number == number1) {
                    homerun = homerun + 1;
                    Toast.makeText(MainActivity.this, "Home Run " + "No " + homerun, Toast.LENGTH_SHORT).show();
                    message.setVisibility(View.VISIBLE);
                } else {
                    message.setVisibility(View.GONE);
                }


            }
        });

    }
}
