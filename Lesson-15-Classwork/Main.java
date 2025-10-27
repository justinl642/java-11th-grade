class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
    public class approxPi {
    public static double approxPI(int term) {
        double approx = 0.0;
        for (int i = 0; i < term; i++) {
            approx += Math.pow(-1, i) / (2 * i + 1);
        }
        return 4 * approx;
    }

    public static void main(String[] args) {
        int term = 5;
        double piApprox = approxPI(term);
        System.out.println("Approximation of PI with " + term + " terms: " + piApprox);
    }
}


  }

  
  
  
}