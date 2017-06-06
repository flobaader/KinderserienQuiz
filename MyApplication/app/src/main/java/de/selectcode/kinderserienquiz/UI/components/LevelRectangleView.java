package de.selectcode.kinderserienquiz.UI.components;

        import android.content.Context;
        import android.graphics.Color;
        import android.view.ViewGroup;
        import android.widget.ProgressBar;
        import android.widget.TextView;

        import de.selectcode.kinderserienquiz.DataManagment.Level;

/**
 * TODO: document your custom view class.
 */
public class LevelRectangleView extends IRectangleView {
    private Level level;



    public LevelRectangleView(Context context, Level l) {
        super(context);
        this.level = l;

        this.setBackgroundColor(Color.GRAY);
        this.setOrientation(VERTICAL);

        //Title
        TextView t = new TextView(this.getContext());
        t.setLayoutParams(new LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        t.setText(getLevel().getName());
        this.addView(t);

        //ProgressBar
        ProgressBar p = new ProgressBar(this.getContext(),
                null,
                android.R.attr.progressBarStyleHorizontal);
        p.setLayoutParams(new LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        p.setIndeterminate(false);
        p.setProgress(getLevel().getSolvedSeriesAmount() / getLevel().getSeriesAmount());
        this.addView(p);

    }


    public Level getLevel() {
        return level;
    }
}
