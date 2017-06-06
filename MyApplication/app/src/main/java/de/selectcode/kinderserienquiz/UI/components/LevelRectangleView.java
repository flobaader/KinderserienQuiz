package de.selectcode.kinderserienquiz.UI.components;

        import android.content.Context;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.LinearLayout;
        import android.widget.ProgressBar;
        import android.widget.TextView;

        import static android.view.ViewGroup.*;

/**
 * TODO: document your custom view class.
 */
public class LevelRectangleView extends LinearLayout {

    public LevelRectangleView(Context context) {
        super(context);
    additionaleConstructor();
    }


    public void onClick(View view){
        Log.d("Hallo", "Test");
    }

    public LevelRectangleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        additionaleConstructor();
    }

    public LevelRectangleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        additionaleConstructor();
    }


    private void additionaleConstructor(){
        this.setBackgroundColor(Color.GRAY);
        this.setOrientation(VERTICAL);

        //Title
        TextView t = new TextView(this.getContext());
        t.setLayoutParams(new LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        t.setText("Benjamin Blümchen");
        this.addView(t);

        //ProgressBar
        ProgressBar p = new ProgressBar(this.getContext(),
                null,
                android.R.attr.progressBarStyleHorizontal);
        p.setLayoutParams(new LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        p.setIndeterminate(true);
        p.setProgress(20);

        this.addView(p);

    }


}
