// Interfaces.java: Demonstrates Java interfaces and polymorphism
// An interface is like a contract - it defines what methods classes must implement,
// but doesn't provide the implementation details. This allows different classes
// to be treated the same way through the interface type.

// Animal interface: Defines the contract that all animal classes must follow
// Any class that implements Animal MUST provide implementations for makeSound() and getName()
interface Animal {
    void makeSound();     // Every animal must be able to make some kind of sound
    String getName();     // Every animal must have a way to return its name
}

// Dog class implements the Animal interface
// This means Dog promises to provide implementations for all Animal methods
class Dog implements Animal {
    private String name;  // Each dog has its own name, stored privately

    // Constructor: Creates a new Dog with the given name
    public Dog(String name) {
        this.name = name;  // Store the name for this specific dog
    }

    // Implementation of makeSound() from Animal interface
    // @Override tells us this method is fulfilling the interface contract
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");  // Dogs bark
    }

    // Implementation of getName() from Animal interface
    @Override
    public String getName() {
        return name;  // Return this dog's name
    }
}

// Cat class also implements the Animal interface
// Cats and dogs both follow the same Animal contract but behave differently
class Cat implements Animal {
    private String name;  // Each cat has its own name

    // Constructor: Creates a new Cat with the given name
    public Cat(String name) {
        this.name = name;  // Store the name for this specific cat
    }

    // Cat's version of makeSound() - different from Dog's implementation
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");  // Cats meow
    }

    // Cat's version of getName() - same logic as Dog but for cats
    @Override
    public String getName() {
        return name;  // Return this cat's name
    }
}

// InterfaceDemo class: Shows how to use interfaces in practice
class InterfaceDemo {

    // This method demonstrates the power of interfaces and polymorphism
    // Polymorphism means "many forms" - we can treat different objects the same way
    public static void demonstrateInterfaces() {
        // Create Dog and Cat objects, but store them as Animal types
        // This is polymorphism - we can use the interface type to refer to any implementing class
        Animal dog = new Dog("Buddy");    // Dog object, but Animal reference
        Animal cat = new Cat("Whiskers"); // Cat object, but Animal reference

        // Even though dog and cat are stored as Animal types, we can call the interface methods
        // The correct implementation (Dog's or Cat's) will be called automatically
        dog.makeSound();  // Calls Dog.makeSound() - prints "Buddy says: Woof!"
        System.out.println("Dog's name: " + dog.getName());  // Calls Dog.getName()

        cat.makeSound();  // Calls Cat.makeSound() - prints "Whiskers says: Meow!"
        System.out.println("Cat's name: " + cat.getName());  // Calls Cat.getName()

        // Advanced polymorphism: Array of different Animal types
        // We can treat dogs and cats the same way because they both implement Animal
        Animal[] animals = {dog, cat};  // Array can hold any Animal implementation

        // Loop through all animals and make them all make sounds
        // Each animal will use its own implementation of makeSound()
        for (Animal animal : animals) {
            animal.makeSound();  // Polymorphism in action!
        }

        // This demonstrates why interfaces are powerful:
        // - We can write code that works with any Animal, not just specific types
        // - New animal types can be added without changing this code
        // - The interface provides a common way to interact with different classes
    }
}
