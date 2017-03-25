class Admin{
		
		private User user;
		
		Admin(User user){
			this.user=user;
		}
		public String getAdminName(){
			
			return user.getUsername();
		}
		///**
		commentaire
		*///
		public boolean setUsername(String Name, String Pass){
			
			if(!Pass.equals(getPassword())){
				System.out.println("if the Password is incorrect");
				return false;
			}
			else{
				System.out.println("if the Username is updated");
				user.setUsername(Name);
				return true;
			}
		}
		
		public long getId(){
			return user.getId();
		}
		///**
		commentaire
		*///
		public boolean updatePass(String Name, String Pass, String OldPass){
		
			
			if(!name.equals(getAdminName())){
				System.out.println("if The user name is incorrect");
				return false;
			}
			else if(!oldPass.equals(user.getPassword())){
				System.out.println("if The old pass word does not match");
				return false;
			}
			else{
				System.out.println("if the Password is updated");
				setUsername(Name);
				return true;
			}
		}
		public String getPassword(){
			return user.getPassword();
		}
	}
