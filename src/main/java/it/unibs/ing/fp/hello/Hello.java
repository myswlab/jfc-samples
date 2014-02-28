package it.unibs.ing.fp.hello;

public class Hello {
	private final String baseMessage;

	public Hello(String baseMessage) {
		this.baseMessage = baseMessage;
	}

	public Hello() {
		this("Hello");
	}

	public String sayHello() {
		return sayHelloTo("World");
	}

	public String sayHelloTo(String target) {
		return baseMessage + ", " + target + "!";
	}

}
