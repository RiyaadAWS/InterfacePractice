import java.util.*;

public class Mainclass implements InterfaceDec{


    public Mainclass() {
    }

    @Override
    public Collection value() {
        //collections interface
        Collection values = new ArrayList();

        values.add(6);
        values.add(22.5);
        values.add("Ryklief");
        values.add(32);
        values.add("Riyaad");

        for (Object i : values){

            System.out.println(i);

        }
        System.out.println();
        return values;
    }

    @Override
    public Map<String, String> map() {
        //map interface
        Map<String, String> map = new HashMap<String, String>();
        map.put("My Name ", "Riyaad");
        map.put("My Surname ", "Ryklief");
        map.put("My Car ","Honda");
        map.put("Age ","26");

            // printing the values using the below method will print it in a sequence since map has set built into it.
            //System.out.println(map);

            // inorder to print the values in the order they were declared we would need to use keySet as below:
            Set<String> keys = map.keySet();

            for (String key : keys){

                System.out.println(key + "" + map.get(key));

        }

        System.out.println();
        return map;
    }

    @Override
    public Set<Integer> digits() {

        //Set Interface, returns a boolean value and will not duplicate elements in the list below
        Set<Integer> digits = new HashSet<>();

        digits.add(31);
        digits.add(16);
        digits.add(15);
        digits.add(11);
        digits.add(11);
        digits.add(31);

        for(int i:digits) {

            System.out.println(i);

        }
        System.out.println();
        return digits;
    }

    @Override
    public List<Integer> values() {
        //List interface
        List<Integer> values = new ArrayList<Integer>();

        values.add(6);
        values.add(22);
        values.add(100);
        values.add(32);

        Collections.sort(values);

        for (Object i : values){

            System.out.println(i);

        }
        System.out.println();
        return values;
    }

    public static void main(String[] args) {

        Mainclass run = new Mainclass();

        run.value();// collections method
        run.digits();//set method
        run.map(); //map method
        run.values(); //list method

    }

}
