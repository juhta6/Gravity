package gravity;

public class Object {
	private float Force;
	private float Mass;
	private float Acceleration;
	
	private float Position = 0.0f;
	private float Velocity = 0.0f;
	
	public Object(float force, float mass, float acceleration) {
		Force = mass*acceleration;
		Acceleration = force/mass;
		Mass = acceleration * force;
	}
	
	public void setPosition(float velocity, float dt) {
		Position += velocity*dt;
	}
	
	public void setVelocity(float acceleration, float dt) {
		Velocity += acceleration*dt;
	}
	
	public float getPosition() {
		return Position;
	}
	
	public float getVelocity() {
		return Velocity;
	}
}
