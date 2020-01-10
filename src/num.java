public class num implements Comparable{
    private int value;

    public num(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public Boolean equals(num otherNum){
        return this.value == otherNum.value;
    }

    public int compareTo(Object other){
        num otherNum = (num) other;
        return this.getValue() - otherNum.getValue();
    }
}
