public class Employee implements Observer 
{
	public Employee(People people) {
		this.people = people;
	}
	public void update(Message m) {
	        System.out.println("Message Subscribed :: "+people.getName()+ "  " + m.getMessageContent());
	    }
	
	public void setPeople(People p) {
			this.people = p;
		}
	private People people;
}
