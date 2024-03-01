import java.util.ArrayList;

public class testingMain {
    public static void main(String[] args) {

//        String name = "Dilshara";
//        String[] names = new String[5];
//        names[0] = "Dilshara";
//        names[1] = "Dinuka";
//        names[2] = "Manura";
//        System.out.println(names[0]);
//        for(int j=0; j<names.length; j=j+1){
//            String currName = names[j];
//            System.out.println(currName);
//        }
        ArrayList<String> names = new ArrayList<String>();
        names.add("Dilshara");
        names.add("Dinuka");
        names.add("Kavindu");
        
        for(int j=0; j<names.size(); j++){
            System.out.println(names.get(j));
        }
    }
}
