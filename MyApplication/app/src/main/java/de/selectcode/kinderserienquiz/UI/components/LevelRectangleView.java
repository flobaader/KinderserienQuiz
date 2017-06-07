package de.selectcode.kinderserienquiz.UI.components;

        import android.content.Context;
        import android.graphics.Color;
        import android.media.Image;
        import android.view.Gravity;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.LinearLayout;
        import android.widget.ProgressBar;
        import android.widget.TextView;

        import de.selectcode.kinderserienquiz.DataManagment.Level;

public class LevelRectangleView extends IRectangleView {
    private Level level;

    public LevelRectangleView(Context context, Level l) {
        super(context);
        this.level = l;

        LayoutParams layoutParams = new LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        layoutParams.setMargins(100,40,100,40);
        layoutParams.gravity = Gravity.CENTER_HORIZONTAL;


        //Title
        TextView t = new TextView(this.getContext());
        t.setText(getLevel().getName());
        t.setLayoutParams(layoutParams);
        t.setAllCaps(true);
        this.addView(t);

        //ProgressBar
        ProgressBar p = new ProgressBar(this.getContext(),
                null,
                android.R.attr.progressBarStyleHorizontal);
        p.setLayoutParams(layoutParams);
        p.setIndeterminate(false);
        p.setProgress((getLevel().getSolvedSeriesAmount() / getLevel().getSeriesAmount() * 100));
        this.addView(p);

        //Linear Layout Stars

        LinearLayout layoutStars = new LinearLayout(this.getContext());
        layoutStars.setOrientation(HORIZONTAL);


        //Status Text
        TextView textViewStatus = new TextView(this.getContext());
        textViewStatus.setLayoutParams(layoutParams);
        String statusText = level.getSolvedSeriesAmount() + "/" + level.getSeriesAmount();
        textViewStatus.setText(statusText);
        layoutStars.addView(textViewStatus);

        //Star image
        //TODO: Integrate

        this.addView(layoutStars);
    }


    public Level getLevel() {
        return level;
    }
}
