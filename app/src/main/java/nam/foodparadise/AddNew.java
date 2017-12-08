package nam.foodparadise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AddNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);
        Log.i("Add TAG", "onCreate: Activity Created");
    }

    public void onclickDone(View view){
        Intent intent = new Intent(this, FoodInfo.class);
        startActivity(intent);
    }

    public void onClickCAMERA(View view){
        Intent intent = new Intent(this, Camera.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ADD tag", "Now running onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ADD tag", "Now Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ADD TAG", "onResume: Running ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("add TAG", "onStop: Stop working ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ADD TAG", "onDestroy: Destroyed ");
    }
}
