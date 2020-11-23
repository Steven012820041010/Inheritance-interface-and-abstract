package com.sz.HW1Person;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person steven = new Person("Steven","71 Henry Bauer, L6C 0T1", "289-800-7093", "1821075925@qq.com");
		System.out.println(steven.toString());
		
		Student kevin = new Student("Kevin","71 Henry Bauer, L6C 0T1", "289-800-7093", "2842106105@qq.com","Fresh man");
		System.out.println(kevin.toString());
		
		Employee benny = new Employee("Benny","1234 Hello" , "123-456-7890","theCoolKid@smart.com","D5",14605.60);
		System.out.println(benny);
		
		Employee mark = new Faculty("Mark","5678 Hi","098-765-4321","markZhang@lazy,com","4B",2340.89,5,'E');
		System.out.println(mark);
		
		Staff andrew = new Staff("Andrew","2088 Bur Oak", "111-222-3333","andrewYe@cute.com","2H",3459.32,"Clean Up");
		System.out.println(andrew);
		
	}

}
