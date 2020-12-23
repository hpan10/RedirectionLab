public class PigLatin{

  public static String pigLatinSimple(String s){
    String vowels = "aeiou";
    s = s.toLowerCase();
    if (vowels.contains("" + s.charAt(0))) return s + "hay";
    if (s.length() > 1) return s.substring(1) + s.charAt(0) + "ay";
    return s + "ay";
  }

  public static void main(String[] args) {
    System.out.println(pigLatinSimple(args[0]));
  }
}
