public class Employee {
		private String name, address;
		private int age;

			public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
			}
		}
		class TestEmployee{
			public static void main(String[] args) {
				Employee em=new Employee();
				em.setName("Kamalendu");
				em.setAddress("Cooch Behar");
				em.setAge(24);
				System.out.println("Name: "+em.getName());
				System.out.println("Address: "+em.getAddress());
				System.out.println("Age: "+em.getAge());

			}
}
