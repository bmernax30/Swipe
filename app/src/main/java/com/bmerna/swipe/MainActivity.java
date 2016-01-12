package com.bmerna.swipe;

import android.gesture.GestureUtils;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView myText;
    private GestureDetectorCompat gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = (TextView)findViewById(R.id.myText);
        this.gestureDetector=new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        myText.setText("DoubleTap");
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        myText.setText("MotionEvent");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        myText.setText("DoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        myText.setText("Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        myText.setText("ShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        myText.setText("SingleTap");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        myText.setText("Scroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        myText.setText("LongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        myText.setText("Fling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
