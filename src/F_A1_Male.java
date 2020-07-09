import java.util.ArrayList;

public class F_A1_Male extends F_A1_Human{

    @Override
    public void getChromosomes() {
        System.out.println("xy");
        System.out.println();

        ArrayList< String > ListMale = new ArrayList<>();

        ListMale.add("Herbert");
        ListMale.add("Hermann");
        ListMale.add("Heinrich");

        for(String male : ListMale){
            System.out.println(male);
        }

    }
}
