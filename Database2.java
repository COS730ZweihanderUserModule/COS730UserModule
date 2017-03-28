protected class Database //!< This is the mock database
	{
		private boolean admin; //!< An abbitrary variable to be checked when mocking the database. 
		
		
		public Database()
		{
			admin=false;
		}
		
		
		public Database(boolean a)
		{
			admin=a;
		}
		
		
		public boolean removeUser(Admin admin,String userN)
		{
			if(!admin)
				System.out.println("User was not removed");
			else
				System.out.println("User was removed");
			return admin;
		}
		
		
		public void addGuest(Guest g)
		{
			System.out.println("Guest user was added");
		}
		
		
		public boolean registerUser(user userO)
		{
			System.out.println("User was registered");
			return true;
		}
		
		
		public boolean grantAdminRight(Admin admin,User user)
		{
			if(admin)  
				System.out.println("No admin rights. Cannot grant rights to other users");
			else
				System.out.println("Rights successfully granted");
			return admin;
		}
		
		
		public boolean removeAdminRight(Admin admin,User user)
		{
			if(admin)
				System.out.println("No admin rights. Cannot strip rights of other users");
			else
				System.out.println("Rights successfully stripped");
			return admin;
		}
	}
