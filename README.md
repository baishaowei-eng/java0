# java-Experiment-1
## 1. 实验内容
1. 基本要求是完成教材P110页的第四题关于PC、HardDisk、CPU类的使用。
2. 每个类定义不少于两个属性，且属性的类型应该多样化;
3. 根据课堂中关于访问权限的内容，尝试定义属性的修饰多样化，类中定义方法操作属性，避免直接通过“类对象属性的形式访问属性值;且定义的方法内应该又符合常理的逻辑判断。
4. 尝试把本次实验的多个类放置在不同的包中，体验修饰符private的用法。
## 2. 实验设计
1.设置硬盘对象，给CPU对象设置amount,speed方法。设置amount,speed方法在硬盘对象外不可访问

    public class CPU {
    public int Speed;   
    public String name; 

 ## 3. 核心方法
 
   1.
          
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
  
   2.
          实列话CPU和硬盘对象来进行初始化，在通过show 方法来输出相应的内容。     
          CPU cpu=new CPU();
	     HardDisk HD= new HardDisk();
   
   
   ## 4. 实验结果
   
    CPU:2200
    硬盘容量:200GB
    硬盘价格:100
    CPU名称:鸿蒙

  ## 5.实验感想

  1. 通过这个实验学习到了
     public private 的不同用法
  2. 如何通过构造方法来获取相应的值
  3. 学会了如何导出项目

   
     
