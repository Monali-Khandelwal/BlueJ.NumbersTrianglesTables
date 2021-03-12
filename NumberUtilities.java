


public class NumberUtilities {

    public static String getRange(int stop) {
        String outcome = "";
        for (int i=0; i<stop; i++){
            outcome = outcome.concat(String.valueOf(i));
        }
        System.out.println(outcome);

        return outcome;
    }

    public static String getRange(int start, int stop) {
        String outcome = "";
        for (int i=start; i<stop; i++){
            outcome = outcome.concat(String.valueOf(i));
        }
        System.out.println(outcome);
        return outcome;
    }


    public static String getRange(int start, int stop, int step) {
       String outcome = "";
       int i =start;
       while(i<stop){
           outcome = outcome.concat(String.valueOf(i));
           i = i+step;
        }
        System.out.println(outcome);
        
        return outcome; 
       
    }

    public static String getEvenNumbers(int start, int stop) {
       String outcome = ""; 
       int i =start;
       while(i<stop){
           
           if(i % 2 == 0){
           outcome = outcome.concat(String.valueOf(i)); 
            }
           i++;
        }
        System.out.println(outcome);
        
        return outcome; 
    }


    public static String getOddNumbers(int start, int stop) {
        String outcome = ""; 
       int i =start;
       while(i<stop){
           
           if(i % 2 != 0){
           outcome = outcome.concat(String.valueOf(i)); 
            }
           i++;
        }
        System.out.println(outcome);
        
        return outcome; 
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String outcome = ""; 
       int i =start;
       double result = 0;
       int result1 =1;
       while(i<=stop){
           result = Math.pow(i,exponent);
           result1 = (int)result;
           
           outcome = outcome.concat(String.valueOf(result1)); 
        
           i++;
        }
        System.out.println(outcome);
        
        return outcome; 
    }
}

