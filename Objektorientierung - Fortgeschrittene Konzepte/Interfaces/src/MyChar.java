public class MyChar implements Commentable, Flagable
{
    private char character;
    private String comment;

    private boolean flag;

    public MyChar(char character, String comment, boolean flag) {
        this.character = character;
        this.comment = comment;
        this.flag = flag;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public void clearComment() {
        this.comment = "";
    }

    @Override
    public String toString() {
        return "Character: " + character + "\n" + "Comment: " + comment + "\n"+ "Flag: " + flag;
    }

    @Override
    public boolean getFlag() {
        return flag;
    }

    @Override
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void resetFlag()
    {
       this.flag = false;
    }
}
