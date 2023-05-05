public class MyNumber implements Commentable, Flagable
{

    private int number;
    private String comment;

    private boolean flag;

    public MyNumber(int number, String comment, boolean flag) {
        this.number = number;
        this.comment = comment;
        this.flag = flag;
    }

    @Override
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public void clearComment() {
        this.comment = "";
    }

    @Override
    public String toString() {
        return "Number: " + number + "\n"+ "Comment: " + comment + "\n"+ "Flag: " + flag;
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
    public void resetFlag() {
        this.flag = false;
    }
}
