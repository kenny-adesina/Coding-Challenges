public class MyKitten{
   
  
  public String kittenChecker(int food){
    if(food < 30){
      return "Not enough";
    } else if(food >= 30 && food <= 45){
       return "Just right";
    } else {
       return "Too Much";
    }
  }

}
