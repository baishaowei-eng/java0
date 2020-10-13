package computer_package;

import computer_package1.*;

public class PC {
	     private CPU cpu;
         private HardDisk HD;
  void setCPU(CPU cpu){
	 this.cpu=cpu;
 }
  void setHardDisk(HardDisk Hd){
	  this.HD=Hd;
  }

public void show() {
	// TODO Auto-generated method stub
	 System.out.println("CPU:"+cpu.getSpeed());
	 System.out.println("”≤≈Ã»›¡ø:"+HD.getAmount());
	 System.out.println("CPU√˚≥∆:"+cpu.getName());

}

}
