package de.selectcode.kinderserienquiz.UI.components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.concurrent.Callable;

import de.selectcode.kinderserienquiz.DataManagment.Serie;

/**
 * Created by steph on 06.06.2017.
 */

public class SeriesRectangleView extends IRectangleView {
    private Serie serie;
    private TextView title;

    public SeriesRectangleView(Context context, Serie serie) {
        super(context);
        setSerie(serie);
        showSerie(serie);
    }


    private void showSerie(Serie serie){
        title = new TextView(this.getContext());
        title.setLayoutParams(new LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        if (serie.isSolved()){
            //Serie is already solved -> show title of the serie and a star
            serieSolved();
        } else {
            //Serie is not solved -> show question mark
            serieNotSolved();
        }

        addView(title);
    }

    private void serieSolved(){
        title.setText(serie.getName());
    }

    private void serieNotSolved(){
        title.setText("?");
    }


    //Getter and setter
    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
