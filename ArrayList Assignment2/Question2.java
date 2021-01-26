import java.util.ArrayList;

class Question2 {






    public static ArrayList<Integer> sieveE(int n) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        
     
        for (int i = 2; i <= n; i++) {
            newList.add(i);
        }
        
   
        for (int i = 0; i < newList.size(); i++) {
            int p = newList.get(i);
            for (int j = i+1; j < newList.size(); j++ ) {
                if (newList.get(j) % p == 0) {
                    newList.remove(j);
                    j--;
                }
            }
            
    }
    return newList;
}



  public static void goldbachSum(int n) {
        ArrayList<Integer> primes = sieveE(n);
        for (int i = 0; i < primes.size(); i++) {
            int firstPrime  = primes.get(i);
            int secondPrime = n - firstPrime;
            if (primes.contains(secondPrime)) {
                System.out.println(firstPrime +  " + " + secondPrime + " = " + n);
                return;
            }
        }
    }
    
    public static void main (String[] args) {
        for (int i = 4; i <= 100; i += 2) {
            goldbachSum(i);
        }
    }
}