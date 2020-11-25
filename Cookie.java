//Molly Campbell & Dominic Dalessandro are partners
class Cookie{
  private int number,bakeTime,bakeTemp;
  private boolean isReady;

  Cookie(){
    number = 0; 
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

  Cookie (int aNumber, int aBakeTemp) {
    number = aNumber; 
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
    System.out.println("The cookies were baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    isReady=true;
  }

}