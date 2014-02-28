package it.unibs.ing.fp.hello;

public class Hello {

	public String sayHello() {
		return sayHelloTo("World");
	}

	public String sayHelloTo(String target) {
		return "Hello, " + target + "!";
	}

}
