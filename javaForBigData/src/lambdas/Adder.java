package lambdas;

@FunctionalInterface
public interface Adder<F> {
	F add(F from1, F from2); //method declaration
}
