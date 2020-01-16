package CompositeDesignPattern;

public class SimpleTest {
	public static void main(String[] args) {

		IComponent myFirstComp = new Composite("I'm the Root		 [FirstComp].");
		IComponent mySecondComp = new Composite("I'm the Right-Child	 [SecondComp].");
		IComponent myThirdComp = new Composite("I'm the Left-Child	 [ThirdComp].");

		myFirstComp.addComponent(mySecondComp);
		myFirstComp.addComponent(myThirdComp);

		IComponent myFirstLeaf = new Leaf("I'm the Right-Child of   [SecondComp].");
		IComponent mySecondLeaf = new Leaf("I'm the Left-Child of    [SecondComp].");

		mySecondComp.addComponent(myFirstLeaf);
		mySecondComp.addComponent(mySecondLeaf);

		myFirstComp.operation();
		
		System.out.print("\n");
		mySecondComp.removeComponent(mySecondLeaf);
		mySecondComp.operation();
	}

}
