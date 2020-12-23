import java.util.Scanner;
public class MakeStars{

  public static void main(String[] args) {
    Scanner file = new Scanner(System.in);
    while (file.hasNext()){
      Scanner line = new Scanner(file.nextLine());
      while (line.hasNext()){
        String nextWord = line.next();
        for (int i = 0; i < nextWord.length(); i++){
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println("");
    }
  }

}
