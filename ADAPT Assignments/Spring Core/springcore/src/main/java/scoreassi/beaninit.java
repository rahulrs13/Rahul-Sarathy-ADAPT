package scoreassi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class beaninit {

	void sys() {
		System.out.println("Bean Intializing Process");
	}
	
	void init() {
		System.out.println("Initializing Bean");
	}
	void dest() {
		System.out.println("Destroying Bean");
	}
	@PostConstruct
	void initbeaninit() {
		System.out.println("Postconstruct bean");
	}
	@PreDestroy
	void destbeaninit() {
		System.out.println("PreDestroy Bean");
	}
}
