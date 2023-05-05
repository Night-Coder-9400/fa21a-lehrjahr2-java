import java.util.NoSuchElementException;

public class ArrayStack implements Stack
{
    private int[] data;
    private int index;

    public ArrayStack(int capacity) {
        data = new int[capacity];
        index = -1;
    }

    @Override
    public void push(int element)
    {
        //wenn zu groß neues Array, größe verdoppeln
        if(index == data.length - 1)
        {
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        index++;
        data[index]=element;
    }

    @Override
    public int pop() {
        if(empty())
        {
            throw new NoSuchElementException( "Der Stack ist leer!");
        }
        int element = data[index];
        index--;
        return element;
    }

    @Override
    public int peek() {
        if(empty()){
            throw new NoSuchElementException("Der Stack ist leer!");
        }
        return data[index];
    }

    @Override
    public boolean empty() {
        return index == -1;
    }

    @Override
    public void clear() {
        //Integer
        this.index = 0;
        int length = this.data.length;
        this.data = new int[length * 2];
    }
}
