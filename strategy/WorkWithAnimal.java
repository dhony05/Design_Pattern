package com.collabera.jump.design_pattern.strategy;

public class WorkWithAnimal {

	public static void main(String[] args) {
		
		Dog papotico = new Dog();
		papotico.setName("Papotico");
		System.out.println(papotico.getName());
		
		papotico.digHole();
		
		papotico.setWeight(-1);
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Animal is :" + doggy.getSound());
		System.out.println("Animal is :" + kitty.getSound());
		
		Giraffe giraffe = new Giraffe();
		giraffe.setName("Vito");
		System.out.println(giraffe.getName());
		
		
		

	}

}
