package HashMap;

public class Pair<Integer, String>{



    Integer key;
    String value;

    public Pair(Integer key, String value){
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getVal() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
