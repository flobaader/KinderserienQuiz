package de.selectcode.kinderserienquiz.UI.components;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.concurrent.Callable;

/**
 * Created by floba on 06.06.2017.
 */

public abstract class IRectangleView extends LinearLayout{
    Callable<?> function;


    public IRectangleView(Context context) {
        super(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.setMargins(10, 10, 10, 10);
        this.setMinimumHeight(100);
        this.setLayoutParams(layoutParams);
        this.setBackgroundColor(Color.GRAY);
        this.setOrientation(VERTICAL);
        this.setClickable(true);

    }
}
