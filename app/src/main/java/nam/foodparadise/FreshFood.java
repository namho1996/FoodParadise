package nam.foodparadise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FreshFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fresh_food);
        Log.i("Freshfood", "onCreate: Activity Created");
    }

    public void onClickview(View view){
        Intent intent = new Intent(this, FoodInfo.class);
        startActivity(intent);
    }

    public void onClickadd(View view) {
        Intent intent = new Intent(this, AddNew.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("freshfood tag", "Now running onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("freshfood tag", "Now Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Freshfood TAG", "onResume: Running ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Freshfood TAG", "onStop: Stop working ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("FreshFood TAG", "onDestroy: Destroyed ");
    }
}
