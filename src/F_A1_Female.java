import java.util.ArrayList;

public class F_A1_Female extends  F_A1_Human{

    @Override
    public void getChromosomes() {
        System.out.println("xx");
        System.out.println();

        ArrayList< String > ListFemale = new ArrayList<>();

        ListFemale.add("Karin");
        ListFemale.add("Katrin");
        ListFemale.add("Katerina");

        for(String male : ListFemale){
            System.out.println(male);
        }
    }
}
