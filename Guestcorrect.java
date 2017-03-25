class Guest{
		
		private String username;
		private String email;
		/**
		commentaire 
		*/
		Guest(String name, String email){
			
			
			username=name;
			email=email;
		}
		public String getName(){
			return username;
		}
		public String getEmail(){
			return email;
		}
	}
