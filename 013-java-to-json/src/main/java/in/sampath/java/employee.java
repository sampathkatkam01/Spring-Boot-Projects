package in.sampath.java;

	public class employee {

		private Integer EID;
		private String Name;
		public Integer getEID() {
			return EID;
		}
		public void setEID(Integer eID) {
			EID = eID;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public employee(Integer eID, String name) {
			super();
			EID = eID;
			Name = name;
		}
		
		
	}

