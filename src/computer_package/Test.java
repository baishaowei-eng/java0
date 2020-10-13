package computer_package;

import computer_package1.CPU;

public class Test {
   public static void main(String[] args) {
	CPU cpu=new CPU();
	HardDisk HD= new HardDisk();
	cpu.setSpeed(2200);
	cpu.setName("∫Ë√…");
	HD.setAmount(200);
	PC pc=new PC();
	pc.setCPU(cpu);
	pc.setHardDisk(HD);
	pc.show();
	
}
}

