
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//normal ones
		
		//Animal animal = new Animal();
		
		//you can create objects of any of the subclasses like you would normally
		//Lion l =  new Lion();
		//printed out constructors for all of the parent classes for lion as well (Goat, TA, Animal)
		//calling all parent classes/extensions
		
		//calls to super - means it goes to the parent, the grandmaster --> 
		
		
		//mixing declared types and constructor call
		Animal a= new Lion(); // go right to left, pass is-A --> goes to Lion class
		//is a Lion necessarily an animal? yes
		// Lion l = new Animal(); does not work as not all animals are not lion, but all lions are animals
		//going from right to left, animal is not necessarily lion
		
		
		( (Lion)a).eat(); // chomp chomp chomp is printed because Lion type is used to create object
		// because it's declared as an Animal type, if .eat method in Animal is deleted, cannot use . eat
		//unless it's casted as Lion
		// can't call methods in parent class when you ahve this kind of mixing and parent type
		
		//if you want to say something is the subclass of a parent class, use extend
		//implicit call to super in all subclasses
		
//		Lion simba = new Lion();
//		simba.eat(); //Lion object can use public methods from parent classes --- child classes
		//inherits methods from parents
		//can override method too though
		
		
		//multiple inheritance is not multiple level inheritance
		//multiple inheritance is when you have more than one parent
		//but you can have grandparents - asexual reproduction 
		System.out.println(a.getClass());
	}

}
