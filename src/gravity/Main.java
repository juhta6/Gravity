package gravity;

public class Main {

	public static void main(String[] args) {
		double t = 0.0;
		float dt = 1.0f;
		Object object = new Object(1, 68, 9.8f);
		
		object.setVelocity(0, dt);
		
		while(t <= 10.0)
			object.setPosition(object.getVelocity(), dt);
			object.setVelocity(0, dt);
			
			t += dt;
			
			System.out.println("t="+t+"\tposition="+object.getPosition()+"\tvelocity="+object.getVelocity());

	}

}
