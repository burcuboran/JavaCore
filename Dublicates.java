package dublicates;

public class Dublicates {
	
	
    public static void main(String[] args) {      
          
  
        String [] a = new String [] {"Java","JSP","JUnit","Java","JSP","JAR"};   
          
       
        //Searches for duplicate element  
        for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                    System.out.println(a[j]);  
            }  
        }  
    }  
}  

