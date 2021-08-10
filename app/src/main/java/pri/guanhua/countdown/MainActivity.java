package pri.guanhua.countdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author guanhua
 */
public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        start = findViewById(R.id.start_count);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 9 ; i > -1 ; i--){

                            textView.setText("" + i);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        textView.setText("" + 10);
                    }
                }).start();
            }
        });
    }
}