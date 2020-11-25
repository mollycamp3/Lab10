class Cookie{
  private int number,bakeTime,bakeTemp;
  private boolean isReady;

  Cookie(){
    number = 0; 
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

  Cookie (int aNum, int aBakeTemp) {
    number = aNum; 
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTemp;
    isReady = false;
  }

  boolean IsReady(){
    return isReady;
  }

  void setNumber(int aCookieNumber){
    number = aCookieNumber;
  }
  
  void bake(int aBakeTemp, int aBakeTime){
    System.out.println(number + " cookies backed at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    isReady=true;
  }

}