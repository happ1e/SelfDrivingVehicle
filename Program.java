public class Program {
	
    public static void main(String []args) {
    	
        System.out.println("Initializing self-driving vehicle...");

        /*Instances*/;
        MotorizedWheel lW = new MotorizedWheel();
        MotorizedWheel rW = new MotorizedWheel();
        
        //Vehicle v heeft een leftWheel en rightWheel
        Vehicle v = new Vehicle(lW, rW);
        World w = new World();

		//de method addVechicle() van de instance World wordt aangeroepen met vehicle als argument
        w.addVehicle(v);
		//de method go() van de instance World wordt aangeroepen
        w.go();
    }
}