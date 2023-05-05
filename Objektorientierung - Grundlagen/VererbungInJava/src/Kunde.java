public class Kunde extends Person
{
    private int kundenId;

    public Kunde(int kundenId, String name)
    {
        super(name);
        this.kundenId = kundenId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKundenId: " + kundenId;
    }

    public void setKundenId(int kundenId) {
        this.kundenId = kundenId;
    }

    public int getKundenId() {
        return kundenId;
    }
}
