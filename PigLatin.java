public class PigLatin{

  public static String pigLatinSimple(String s){
    String vowels = "aeiou";
    s.toLowerCase();
    if (vowels.contains("" + s.charAt(0))) return s + "hay";
    if (s.length() > 1) return s.substring(1) + s.charAt(0) + "ay";
    return s + "ay";
  }

  public static String pigLatin(String s){
    String digraphs = "bl,br,ch,ck,cl,cr,dr,fl,fr,gh,gl,gr,ng,ph,pl,pr,qu,sc,sh,sk,sl,sm,sn,sp,st,sw,th,tr,tw,wh,wr";
    if (s.length() > 1 && digraphs.contains(s.substring(0, 2))) return s.substring(2) + s.substring(0, 2) + "ay";
    else return pigLatinSimple(s);
  }

  public static void main(String[] args) {
    System.out.println(pigLatin(args[0]));
  }
}
