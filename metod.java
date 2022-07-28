public class metod {
    public static String summa(String a, String b) {
        if (a.length()>10||b.length()>10){System.exit(1);}
        return a + b;
    }

    public static String delenie(String a, int b) {
        if (a.length()>10){System.exit(1);}
        int c = a.length() / b;
        char[] s = new char[c];
        a.getChars(0, c, s, 0);
        return String.valueOf(s);
    }
    public static String ymnozhenie(String a,int b){
        if (a.length()>10){System.exit(1);}
        String с = a.repeat(b);
        return с;
    }
    public static StringBuffer raznosty(String a, String b) {
        if (a.length()>10||b.length()>10){System.exit(1);}
        StringBuffer c = new StringBuffer(a);
        int start = a.lastIndexOf(b);
        int dlina = b.length();
        int end = dlina+start;
        c.delete(start,end);
        return c;
    }

}