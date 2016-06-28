package com.harvic.BlogQQRedPoint;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final FrameLayout containerView = (FrameLayout) findViewById(R.id.container);

        final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RedPointView redPointView = new RedPointView(MyActivity.this);
                redPointView.setLayoutParams(layoutParams);
                containerView.removeAllViews();
                containerView.addView(redPointView);
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RedPointViewCopy redPointView = new RedPointViewCopy(MyActivity.this);
                redPointView.setLayoutParams(layoutParams);
                containerView.removeAllViews();
                containerView.addView(redPointView);
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RedPointControlVIew redPointView = new RedPointControlVIew(MyActivity.this);
                redPointView.setLayoutParams(layoutParams);
                containerView.removeAllViews();
                containerView.addView(redPointView);
            }
        });
    }
}
