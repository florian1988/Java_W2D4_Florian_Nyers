import java.util.Scanner;

public class F_A2_Main {



    public static void main(String[] args) {

        // example for method overloading

        F_A2_Car car1 = new F_A2_Car("BMW", 350);
        F_A2_Car car2 = new F_A2_Car("Volvo");

        //car1.car();
        //car2.car();

        // example for method overloading

        F_A2_Dog show = new F_A2_Dog();

        //show.test();


        F_A2_Dog dog1 = new F_A2_Dog();


        F_A2_Cat cat1 = new F_A2_Cat();

        Scanner scan = new Scanner(System.in);
        System.out.println("is it a dog than put in 1 or a cat than put in 2?");
        int animal = scan.nextInt();
        System.out.println("How big is your pet?");
        int big = scan.nextInt();
        System.out.println("How old is your pet?");
        int old = scan.nextInt();


        if(animal == 1){
            dog1.pet(animal,big,old);
            System.out.println("good");
        }else if (animal == 2){
            cat1.pet(animal,big,old);
            System.out.println("Fuck");
        }






    }
}
