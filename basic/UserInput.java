import java.io.*;

class UserInput {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter your name: ");
        String name = br.readLine();
        
        System.out.print("Enter Gender (m/f): ");
        char gen = (char) (br.read());
        br.readLine(); // Consume the newline character
        
        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());
        
        if (gen == 'm' || gen == 'M') {
            System.out.println("Hello Mr. " + name);
        } else if (gen == 'f' || gen == 'F') {
            System.out.println("Hello Ms. " + name);
        } else {
            System.out.println("Invalid input");
        }
        
        System.out.println("Age is: " + age);
    }
}
