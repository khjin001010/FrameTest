package khjin001010.kr.hs.emirim.frametest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button but[]=new Button[3];
    LinearLayout linear[] = new LinearLayout[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<but.length;i++) {
            but[i] = (Button) findViewById(R.id.but_1 + i);
            but[i].setOnClickListener(onclick);
        }
        for(int i=0;i<linear.length;i++) {
            linear[i] = (LinearLayout) findViewById(R.id.linear1 + i);
        }
    }
    View.OnClickListener onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            for(int i=0;i<linear.length;i++){
                if(v.getId()==R.id.but_1+i)
                    linear[i].setVisibility(View.VISIBLE);
                else
                    linear[i].setVisibility(View.INVISIBLE);
            }
        }
    };
}
