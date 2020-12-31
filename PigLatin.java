import java.util.Scanner;
public class PigLatin{

  public static String pigLatinSimple(String s){
    String vowels = "aeiou";
    s = s.toLowerCase();
    if (vowels.contains("" + s.charAt(0))) return s + "hay";
    if (s.length() > 1) return s.substring(1) + s.charAt(0) + "ay";
    return s + "ay";
  }

  public static String pigLatin(String s){
    String digraphs = "bl,br,ch,ck,cl,cr,dr,fl,fr,gh,gl,gr,ng,ph,pl,pr,qu,sc,sh,sk,sl,sm,sn,sp,st,sw,th,tr,tw,wh,wr";
    s = s.toLowerCase();
    if (s.length() > 1 && digraphs.contains(s.substring(0, 2))) return s.substring(2) + s.substring(0, 2) + "ay";
    else return pigLatinSimple(s);
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if (Character.isLetter(s.charAt(0))){
      if (Character.isLetter(s.charAt(s.length() - 1))) return pigLatin(s);
      else return pigLatin(s.substring(0, s.length() - 1)) + s.charAt(s.length() - 1);
    }
    else return s;
  }

  public static void main(String[] args) {
    Scanner file = new Scanner(System.in);
    while (file.hasNext()){
      Scanner line = new Scanner(file.nextLine());
      while (line.hasNext()){
        System.out.print(pigLatinBest(line.next()));
        if (line.hasNext()) System.out.print(' ');
      }
      if (file.hasNext()) System.out.println("");
    }
  }
}
