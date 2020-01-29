
public class prime {
    	 boolean Prime(int num) 
        { 
            // Corner case 
            if (num <= 1) 
                return false; 
      
            // Check from 2 to n-1 
            for (int i = 2; i < num; i++) 
                if (num % i == 0) 
                    return false; 
      
            return true; 
        } 
    }
