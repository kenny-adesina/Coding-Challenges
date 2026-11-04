public class isPrime{

public boolean Prime(int i){
 for(int p = 2; p <= Math.sqrt(i); p++ ){
    if(i % p == 0){
       return false;
    }
 }
    return true;
}


}