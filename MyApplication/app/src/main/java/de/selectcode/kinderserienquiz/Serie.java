package de.selectcode.kinderserienquiz;

/**
 * Created by floba on 06.06.2017.
 */

public class Serie {
    private string name;
    private boolean solved;
    private string youtubeLink;


    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public string getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(string youtubeLink) {
        this.youtubeLink = youtubeLink;
    }
}
