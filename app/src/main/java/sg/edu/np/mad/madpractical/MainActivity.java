package sg.edu.np.mad.madpractical;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user1 = new User("Thaanya","Financial informatics student",1,false);

        TextView nameTV = findViewById(R.id.textView);
        TextView descTV = findViewById(R.id.textView2);
        Button followButton = findViewById(R.id.followBtn);

        nameTV.setText(user1.name);
        descTV.setText(user1.description);
        if(user1.followed){
            followButton.setText("Unfollow");
        }

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user1.followed){
                    user1.followed = false;
                    followButton.setText("Follow");
                }
                else{
                    user1.followed = true;
                    followButton.setText("Unfollow");
                }
                //Log.d(TAG, "ABCDE "+user1.followed);
            }
        });
    }
}