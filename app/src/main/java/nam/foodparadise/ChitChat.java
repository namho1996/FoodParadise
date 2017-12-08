package nam.foodparadise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChitChat extends AppCompatActivity {

    private EditText mEditText;
    private Button mSendButton;
    private TextView mMessages;
    private String mUsername = "My Name";

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mMessagesDatabaseReference;
    private ChildEventListener mChildEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chitchat);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mMessagesDatabaseReference =
                mFirebaseDatabase.getReference().child("messages");

        mMessages = (TextView) findViewById(R.id.messages_text);
        mEditText = (EditText) findViewById(R.id.editText);
        mSendButton = (Button) findViewById(R.id.button2);
        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FriendlyMessage friendlyMessage = new
                        FriendlyMessage(mEditText.getText().toString(), mUsername, null);

                mMessagesDatabaseReference.push().setValue(friendlyMessage);

                mMessages.setText(mMessages.getText().toString() + "\n" +
                        mUsername + " " + mEditText.getText().toString());
                mEditText.setText("");
            }
        });

        if (mChildEventListener == null) {
            mChildEventListener = new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    FriendlyMessage friendlyMessage =
                            dataSnapshot.getValue(FriendlyMessage.class);

                    mMessages.setText(mMessages.getText().toString() + "\n" +
                            friendlyMessage.getName() + " " + friendlyMessage.getText());

                    Toast.makeText(ChitChat.this, "New message: " +
                            friendlyMessage.getText(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {}
                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {}
                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {}
                @Override
                public void onCancelled(DatabaseError databaseError) {}
            };
        }
        mMessagesDatabaseReference.addChildEventListener(mChildEventListener);
        Log.i("Chitchat TAG", "onCreate: Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("chitchat tag", "Now running onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("chitchat tag", "Now Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Chitchat TAG", "onResume: Running ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Chitchat TAG", "onStop: Stop working ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Chitchat TAG", "onDestroy: Destroyed ");
    }
}
