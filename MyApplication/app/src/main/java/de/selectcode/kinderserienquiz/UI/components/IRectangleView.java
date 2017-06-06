package de.selectcode.kinderserienquiz.UI.components;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;

/**
 * Created by floba on 06.06.2017.
 */

public abstract class IRectangleView extends LinearLayout{
    public IRectangleView(Context context) {
        super(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.setMargins(10, 10, 10, 10);

        this.setMinimumHeight(100);

        this.setLayoutParams(layoutParams);

        this.setBackgroundColor(Color.GRAY);
        this.setOrientation(VERTICAL);



    }


}
