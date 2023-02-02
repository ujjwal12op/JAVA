public class ifelse {
    public static void main(String[] args) {
        int age=33;
        // if(age<18){
        //     System.out.println("You cannot vote ");
        // }
        // else{
        //     System.out.println("You can vote now");
        // }

        if(age>=18 && age<=30){
            System.out.println("You can vote now");
        }
        else if(age>31 && age<=50){
            System.out.println("You are becoming old");
        }
        else if(age>51 && age<80){
            System.out.println("Bruh! you are old as fuck");
        }
        else{
            System.out.println("Lol! you are a kid still gotta live more");
        }

    }
}
