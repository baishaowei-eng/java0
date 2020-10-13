package computer_package1;

public class CPU {
  public int Speed;   
  public String name;   
   
   public CPU(int speed, String name) {
	this.Speed = speed;
	this.name = name;
}
	public CPU() {   //CPU ¿Õ·½·¨
	
}
	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		this.Speed = speed;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
}
