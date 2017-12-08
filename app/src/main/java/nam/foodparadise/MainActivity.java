package nam.foodparadise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity TAG", "onCreate: Activity Created");
    }

    public void onClickFresh(View view){
        Intent intent = new Intent(this, FreshFood.class);
        startActivity(intent);
    }

    public void onClickCheap(View view){
        Intent intent = new Intent(this, CheapFood.class);
        startActivity(intent);
    }

    public void onClickFormula(View view){
        Intent intent = new Intent(this, HomeCookFormula.class);
        startActivity(intent);
    }

    public void onClickchitchat(View view){
        Intent intent = new Intent(this, ChitChat.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity tag", "Now running onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity tag", "Now Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity TAG", "onResume: Running ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity TAG", "onStop: Stop working ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity TAG", "onDestroy: Destroyed ");
    }

}
