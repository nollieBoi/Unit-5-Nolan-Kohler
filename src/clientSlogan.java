public class clientSlogan {
    public static void main(String[] args) {
       slogan slogan1 = new slogan("PRESIDENTIAL HARASSMENT");
       slogan slogan2 = new slogan("everything litty i have a big heart, or whatever gunna said");
       slogan slogan3 = new slogan("joe wit da fixed car *embarrassed emoji*");

        System.out.println("Slogans created: " + slogan1.getCount());
        System.out.println(slogan1.toString());
        System.out.println(slogan2.toString());
        System.out.println(slogan3.toString());
    }
}
