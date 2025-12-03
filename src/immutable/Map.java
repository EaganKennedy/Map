package immutable;

import java.util.List;

public abstract class Map {
    interface Entry{
         Object getKey();
         Object getValue();
    }

     static Map create(){
        return null;
    }

    public abstract int size();
    public abstract int depth();
    public abstract boolean empty();
    public abstract Map setValue(Object key, Object value);
    public abstract Object getValue(Object key);
    protected abstract void addEntries(List<Entry> list);
}
