
	public class Update_User {
	    
	    public void get_Update_User(int id,String firstname,String Surname, String description )
	    {
	        String dbfirstname = "KDM"; 
	        String dbSurname ="HUGUES"; 
	        String dbdescription = "I am congolese"; 
	    
	        if(id == 45) 
	        {
	            dbfirstname = firstname; 
	            dbSurname = Surname; 
	            dbdescription = description; 
	            
	        }
	        else
	        {
	            System.out.print("User Does Not exist");
	        } 
	    }
	    
	   
	}
