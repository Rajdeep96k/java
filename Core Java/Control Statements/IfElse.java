public class IfElse {
    public static void main(String[] args) {
        // Selection statements 
        // if-else statements 
        // if, if-else, nested-if, if-else-if ladder

        // Normal if
        // if(i % 2 == 0) {
        //     System.out.println("i is even");
        // }
        // else 
        //     System.out.println("i is odd");

        // Nested ifs
        // i = 8
        // if(i > 5) {
        //     if( i < 10) {
        //         if(i == 7) {
        //         }
        //     }
        //     else {
        //     }
        // }
        // else {
        // }

        // if( i > 5 && i < 10) {

        // }

        // if-else-if ladder
        // int i = 7;
        // if(i == 5) {
        //     System.out.println("i is 5");
        // }
        // else if(i == 6) {
        //     System.out.println("i is 6");
        // }
        // else if(i == 7) {
        //     System.out.println("i is 7");
        // }
        // else if(i == 8) {
        //     System.out.println("i is 8");
        // }
        // else if(i == 9) {
        //     System.out.println("i is 9");
        // }

        int age = 50; // age = 50
        if(age > 80) {
            System.out.println("You are very old");
        }
        if(age > 60) {
            System.out.println("You are old");
        }
        if(age > 40) {
            System.out.println("You are becoming old");
        }
        if(age > 20) {
            System.out.println("You are young");
        }
        else {
            System.out.println("You are a child");
        }
    }
}