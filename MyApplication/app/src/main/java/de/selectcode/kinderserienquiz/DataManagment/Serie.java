package de.selectcode.kinderserienquiz.DataManagment;

/**
 * Created by floba on 06.06.2017.
 */

public class Serie {
    private String name;
    private boolean solved;
    private String youtubeLink;

    public Serie(String name, boolean solved, String youtubeLink){
        setName(name);
        setSolved(solved);
        setYoutubeLink(youtubeLink);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }
}
