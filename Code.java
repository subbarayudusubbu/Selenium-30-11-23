package encapsulation;

public class Code {

	public static void main(String[] args) {
		User k= new User();
		k.setUsername("subbarayudu");
		k.setPhonenumber("9988776655");
		k.setMail("subbu@1234");
		k.setCity("Bangalore");
		
		System.out.println("list of out put:___"+k.getUsername()+" ,"+k.getCity()+ "  ::" +k.getMail());
		
		User s= new User();
		s.setAdderes("hyd");
		s.setUsername("siva");
		s.setUsername("subbarayudu new");
		s.setUsername("subbu");

		
		System.out.println(" name details:--"+s.getAdderes()+"--"+s.getUsername()+" "+s.getUsername());
		
	}

}
