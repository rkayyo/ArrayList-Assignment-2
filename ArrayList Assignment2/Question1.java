import java.util.ArrayList;

class Question1 {
    
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

        public static void main (String[] args) {
        ArrayList<Integer> primesUnder100 = sieveE(100);
        System.out.println(primesUnder100);
    }
}