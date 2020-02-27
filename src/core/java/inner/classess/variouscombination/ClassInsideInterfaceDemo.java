package core.java.inner.classess.variouscombination;

interface EmailService {
	
	public void sendEmail(EmailDetails e);
	
	class EmailDetails {
		private String to;
		private String from;
		public EmailDetails(String to, String from) {
			super();
			this.to = to;
			this.from = from;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		public String getFrom() {
			return from;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		
	}
}

interface Vehicle {
	public int getNoOfWheels();
	class DefaultVehicle implements Vehicle {

		@Override
		public int getNoOfWheels() {
			return 2;
		}
		
	}
}

class Bus implements Vehicle {

	@Override
	public int getNoOfWheels() {
		return 6;
	}
	
}

public class ClassInsideInterfaceDemo {
	public static void main(String[] args) {
		Vehicle.DefaultVehicle d = new Vehicle.DefaultVehicle();
		System.out.println(d.getNoOfWheels());
		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());
		
		EmailService e = new EmailService() {

			@Override
			public void sendEmail(EmailDetails e) {
				System.out.println("Send email to "+ e.getTo());
				System.out.println("Send email from "+ e.getFrom());
			}
			
		};
		
		e.sendEmail(new EmailService.EmailDetails("Sunil", "Jeena"));
	}
}
