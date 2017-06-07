package de.selectcode.kinderserienquiz.UI.components;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.concurrent.Callable;

import de.selectcode.kinderserienquiz.R;

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
        layoutParams.gravity = Gravity.CENTER_HORIZONTAL;
        this.setLayoutParams(layoutParams);
        this.setMinimumHeight(100);
        this.setPadding(10,10,10,10);
        this.setBackgroundColor(Color.WHITE);
        this.setOrientation(VERTICAL);
        this.setClickable(true);

    }
}
