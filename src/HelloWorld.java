public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("New java project");
        InnerHelloWorld inner = new InnerHelloWorld();
        inner.main();
    }
}

class InnerHelloWorld {
    public void main() {
        System.out.println("Java is fun : testing");

        int[] array = {500, 210, 330, 61, 87, 773, 81};
        int max = array[0];
        int min = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}


// select * from HelloWorld;