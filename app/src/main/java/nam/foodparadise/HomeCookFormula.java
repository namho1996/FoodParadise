package nam.foodparadise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class HomeCookFormula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_cook_formula);
        Log.i("HomeCook TAG", "onCreate: Activity Created");
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
        Log.i("homecook tag", "Now running onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("homecook tag", "Now Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("homecook TAG", "onResume: Running ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("homecook TAG", "onStop: Stop working ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("homecook TAG", "onDestroy: Destroyed ");
    }
}
