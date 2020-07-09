public class F_A2_Car {

    String brand;
    int hp;

    F_A2_Car(String brand, int hp){
        this.brand = brand;
        this.hp = hp;

    }
    F_A2_Car(String brand) {
        this.brand = brand;
        this.hp = 100;
    }

    public void car(){
        System.out.println("Brand: " + brand );
        System.out.println("Horse power: " + hp );

    }
}
