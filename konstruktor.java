public class konstruktor {
    // Create a Main class
        int x;

        // Create a class constructor for the Main class
        public konstruktor(int a) {
            this.x = a;
        }

        public static void main(String[] args) {
            konstruktor myObj = new konstruktor(3);
            System.out.println(myObj.x);
        }

}
