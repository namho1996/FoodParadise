package nam.foodparadise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FoodInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_info);
        Log.i("Foodinfo TAG", "onCreate: Activity Created");
    }

    public void onClickmap(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("foodinfo tag", "Now running onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("foodinfo tag", "Now Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("foofinfo TAG", "onResume: Running ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("foodinfo TAG", "onStop: Stop working ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("foodinfo TAG", "onDestroy: Destroyed ");
    }
}