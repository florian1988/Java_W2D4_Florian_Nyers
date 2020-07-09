public class F_A2_Dog extends F_A2_animal{




    public void test1(){
        System.out.println("child");
    }


    @Override
    public void pet(int y, int i, int d){

        if(i < 100){
            if( i < 30){
                System.out.println("This is a little Dog");
            } else if( i < 60) {
                System.out.println("This is a middle sized Dog");
            }else{
                System.out.println("This is a fucking big Dog");
            }
        } else{
            System.out.println("Shit man this is no Dog!!");
        }
        super.pet(y, i, d);
    }



}
