public class IntergerStack
{
    private Integer[] storage = new Integer[10];
    private int index = -1;

    //ArrayIndex out of Bounds Exception
    public String push(Integer i) {
        index++;

        if(index >= storage.length){
            return "Stack voll";
        }
        else{
            storage[index] = i;
            return "Erfolgreich";
        }
    }

    //Out of bounds Exception - Stack ist leer
    public Integer pop() {
        Integer val = storage[index];
        index--;
        return val;
    }

    //Out of bounds Exception - Stack ist leer
    public Integer peek() {
        return storage[index];
    }

    //kein Fehler, außer es ist leerer als leer
    public boolean empty() {
        return index == -1;
    }
}

