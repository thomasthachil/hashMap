/**
 * Created by Thomas on 9/1/16.
 */
public class hashMap {
    String[] keyArray;
    Object[] valueArray;
    int numItems;
    int capacity;


    public hashMap() {
        hashMap(0);
    }
    public hashMap(int size) {
        keyArray = new String[size];
        valueArray = new Object[size];
        capacity = size;
    }

    public boolean set(String key, Object value) {
        if (numItems < capacity) {
            keyArray[numItems] = key;
            valueArray[numItems] = value;
            numItems++;
            return true;
        }
        //        if (get(key) == null)  {
        //            for (int i = 0; i < numItems; i++) {
        //                if (keyArray[i].equals(key)) {
        //                    valueArray[i] = value;
        //                    return true;
        //                }
        //            }
        //        } else {
        //            if (numItems < capacity) {
        //                keyArray[numItems] = key;
        //                valueArray[numItems] = value;
        //                numItems++;
        //                return true;
        //            }
        //        }
        return false;
    }

    public Object get(String key) {
        for (int i = 0; i < numItems; i++) {
            if (keyArray[i].equals(key)) {
                return valueArray[i];
            }
        }
        return null;
    }

    public Object delete(String key) {
        for (int i = 0; i < numItems; i++) {
            if (keyArray[i].equals(key)) {
                Object returnValue = valueArray[i];
                valueArray[i] = null;
                return returnValue;
            }
        }
        return  null;
    }

    public float load() {
        return (float) numItems / (float) size;
    }
}
