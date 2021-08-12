import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter KCSE score: ");
    Scanner input= new Scanner(System.in);
    int KCSE= input.nextInt();
    System.out.println("Enter Interview score: ");
    int interview= input.nextInt();
    System.out.println("Enter Confidence Level score: ");
    int Confidence_Level= input.nextInt();

    if(KCSE >65 && interview >6 && Confidence_Level >5 ){
    System.out.printf( "%s%n%d","Congratulations! Eligible for Admission. ");}
    else{
      System.out.println( "Rejected. Does NOT meet minimum requirements. Try elsewhere.");
    }
  }
}