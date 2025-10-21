class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
  string creditCardType(String cardNumber){
    if(cardNumber.substring(beginIndex:0,endIndex:1).equals(anObject:"4"))
  }
  return "Visa";
  {
    else if(cardNumber.substring(beginIndex:0,endIndex:2).equals(anObject:"34")||cardNumber.substring(0,2).equals(37)){
      return "American Express";

    }
    else if (cardNumber.substring(0,2).equals(36)){
      return "Diners Club";
    }
    else if(cardNumber.substring(0,2).equals(51)||cardNumber.substring(0,2).equals(55)){
      return "Mastercard";
    }
    else if(cardNumber.substring(0,4).equals(6011)||cardNumber.substring(0,2).equals(65)){
      return "Discover";
  }
  else{
    return "Unkown";
  }
  
  
}