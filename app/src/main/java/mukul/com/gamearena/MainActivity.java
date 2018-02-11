package mukul.com.gamearena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  onClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,matha.class);
        startActivity(intent);
    }

    public void onListen(View view)
    {
        Intent intent = new Intent(MainActivity.this,diceactv.class);
        startActivity(intent);
    }

}
