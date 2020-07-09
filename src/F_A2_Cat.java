public class F_A2_Cat extends F_A2_animal{



    @Override
    public void pet(int y, int i, int d){



        if(i < 50){
            if( i < 30){
                System.out.println("This is a little Cat");

            }else{
                System.out.println("This is a fucking big Cat");
            }
        } else{
            System.out.println("Shit man this is no Cat!!");
        }
        super.pet(y , i, d);
    }
}
