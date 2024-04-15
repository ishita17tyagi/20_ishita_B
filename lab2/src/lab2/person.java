package lab2;
public class person {
	  private String name;
	  private int age;
	  public person(String name,int age){
		    this.name=name;
		    this.age=age;
		  }
	  public void printInfo(){
		    System.out.println("Name: "+name+", Age: "+age);
		  }
	  public static void main(String[] args){
		    person person1=new person("Ram", 30);
		    person person2=new person("Sham", 25);
		    person1.printInfo();
		    person2.printInfo();
		  }
}


