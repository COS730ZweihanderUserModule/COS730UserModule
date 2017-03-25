class User{

		private long id;
		private String username;
		private String firstname;
		private String lastname;
		private String email;
		private String password;
		private boolean activated;
		private String activatedKey;
		private String resetKey;
		private Datetime resetDate;

		public User(String username,String firstname,String lastname,String email,String password,boolean activated,String activatedKey String resetKey, Datetime resetDate){
			this.id=idGenerator();
			this.username=username;
			this.firstname=firstname;
			this.lastname=lastname;
			this.email=email;
			this.password=password;
			this.activated=true;
			this.activatedKey=activatedKey;
			this.resetKey=resetKey;
			this.resetDate=resetDate;
		}

		private long idGenerator(){
			///* la creation d'un unique id user *///
			Random rd = new Random()
			return rd(8999999999)+1;
		}
		public long getID(){
			return id;
		}

		 public String getUsername(){

		 	return username;
		 }
		//**
	            commentaire 
		*//
		 public boolean setUsername(String username,String pass){


		 	if(this.password.equals(pass)){
				 System.out.println("username was reset");
		 		this.username=username;
				return true;
			}
			else{

				 System.out.println("password is incorrect");
				return false;
			}
		 }

		 public String getPassword(){

		 	return password;
		 }
		/**
		    * commentaire
		*/
		 public boolean setPassword(String password,String currP){


		 	if(this.password.equals(currP)){
				System.out.println("Password was reset");
		 		this.password=password;
				return true;
			}else{
				 System.out.println("current password is incorrect");
				return false;
			}
		 }

		 public String firstname(){
		 	return firstname;
		 }
		/**
		 *commentaire
		*/
		 public boolean setFirstname(String firstname,String pass){

		 	if(this.password.equals(pass)){
		 		this.firstname=firstname;
				 System.out.println("first was reset");
				return true;
			}
			else{
				 System.out.println("password is incorrect");
				return false;
			}
		 }

		 public String email(){
		 	return email;
		 }
		 /**
	       *commentaire
		*/
		 public boolean setEmail(String email,String pass){

		 	if(this.password.equals(pass)){
				System.out.println("email was reset");
		 		this.email=email;
				return true;
			}else{
				 System.out.println("password is incorrect");
				return false;
			}
		 }

	}
