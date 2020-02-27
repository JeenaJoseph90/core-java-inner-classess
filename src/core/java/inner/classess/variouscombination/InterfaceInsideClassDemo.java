package core.java.inner.classess.variouscombination;

class VehicleType {
	
	// Always static but need not to be public.
	interface Vehicle {
		public int getNoOfVehicle();
	}
	
	class Bus implements Vehicle {

		@Override
		public int getNoOfVehicle() {
			// TODO Auto-generated method stub
			return 6;
		}
		
	}
	
	class Auto implements Vehicle {

		@Override
		public int getNoOfVehicle() {
			// TODO Auto-generated method stub
			return 3;
		}
		
	}
}

public class InterfaceInsideClassDemo {
	
	public static void main(String[] args) {
		VehicleType v = new VehicleType();
		VehicleType.Bus b = v.new Bus();
		System.out.println(b.getNoOfVehicle());
	}
	
}
