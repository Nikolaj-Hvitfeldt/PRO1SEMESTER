package exercise5;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        String str1 = "Yo broder";
        String str2 = "325";
        String str3 = "Putin er en makker";
        String str4 = "Putin er en makker og du ved det";

        list.add(str1);
        list.add(str2);
        list.add(str3);

        System.out.println(findAllIndices(list, "Putin er en makker"));
    }

    public static ArrayList<Integer> findAllIndices(ArrayList<String> list, String target) {
        ArrayList<Integer> indexList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            String k = list.get(i);
            if(k.equals(target)){
                indexList.add(i);
            }
        }
        return indexList;
    }
}

