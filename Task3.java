import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = scanner.nextLine();
        int stringLength = userName.length();
        char myChar = userName.charAt(2);
        String anotherName = "Vika";
        String oneMoreName = "KAtE";
        boolean equalStrings = userName.equals(anotherName);
        boolean equalCase = userName.equalsIgnoreCase(oneMoreName);
        boolean startsWithThis = userName.startsWith("V");
        String lowercase = userName.toLowerCase();
        String updatedName = userName.replace('a', 'b');
        System.out.printf("Glad to meet you, %s!", userName);
        System.out.println("");
        System.out.println(stringLength);
        System.out.println(myChar);
        System.out.println("Your name is Vika - " + equalStrings);
        System.out.println("Your name is Kate - " + equalCase);
        System.out.println("Your name starts with letter 'V' - " + startsWithThis);
        System.out.println("I'm sure your name looks better like this - " + updatedName);
        System.out.println("Your name in lower case - " + lowercase);
    }
}
