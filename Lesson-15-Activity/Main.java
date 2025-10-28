class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
    
  }
public class Challenge1 {
    public static String spaces(int N) {
        return " ".repeat(N);
    }
    
    public static void init(int N) {
        String result = spaces(N) + "DONE";
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        init(5); // Example: prints "     DONE"
    }
}
public class Challenge2 {
    public static double harmonic(int N) {
        double sum = 0.0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int N = 5;
        System.out.println("Harmonic sum is: " + harmonic(N));
        // Output: Harmonic sum is: 2.283333333333333
    }
}


  
}