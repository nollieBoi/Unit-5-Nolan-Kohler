public class slogan {
    private static int count = 0;
    private String slogan;

    public slogan(String slogan){
        this.slogan = slogan;
        count++;
    }

    public static int getCount(){
        return count;
    }
    @Override
    public String toString() {
        return slogan;
    }
}
