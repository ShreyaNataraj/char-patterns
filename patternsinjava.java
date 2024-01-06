public class patternsinjava{
  public static void print_star(int n){
    for(int i =1; i<=n; i++ ){
      for(int j = 1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
  public static void reverse_star(int n){
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=n-i+1; j++){
        System.out.print("*");
      }
      System.out.println("*");
    }
  }
  public static void print_numbers(int n){
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
  public static void print_ch(char ch , int n){
    for(int i = 1; i<=n; i++){
      for(int j =1; j<=i; j++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }

  }
  public static void main(String args[]){
    print_ch('A', 4);
    
  }
}
