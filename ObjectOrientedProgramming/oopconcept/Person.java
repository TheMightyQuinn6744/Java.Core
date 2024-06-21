package oopconcept;

public class Person {

		private String name;
		private double weight;
		private int age;
		private int salary;
		
		//THis is a two-parameter constructor
		public Person(String name, double weight) {
			
			this.name = name;
			this.weight = weight;
		}
		//new constructor four-paramter constructor
		public Person(String name, double weight, int age, int salary) {
			this.name = name;
			this.weight = weight;
			this.age = age;
			this.salary = salary;
		}
		//wakeup method
		public void wakeUp() {
			System.out.println(this.name + " woke up.");
		}
		//eat method
		public void eat() {
			System.out.println(this.name + " had breakfast.");
			this.weight += 1;
		}
		//doexercise method
		public void doexercise() {
			System.out.println(this.name + " did exercise.");
		}
		//showWeight method
		public void showWeight() {
			System.out.println("The current weight of " + this.name + " is " + this.weight + " kg.");
		}
		//toString method
		public String toString() {
			return "Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Weight: " + this.weight + "\n" +  "Salary: $" + this.salary;
		}
}
