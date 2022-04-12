package dsa_danhsach.trienkhiaphuongthucarraylist;

public class TestMyList {
    public static void main(String[] args) {
        //Constructor
        MyList<Integer> myList = new MyList<Integer>(9);

        //Add values
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);

        //Display size myList
        System.out.println("Size of myList: " + myList.size() + "\n");

        //Display value
        System.out.println("myList: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i) + "\t");
        }

        //Remove value
        myList.remove(1);
        System.out.println("myList after remove value at 1st index: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i) + "\t");
        }

        //Clone myList
        System.out.println("myList after clone: " + myList.clone());

        //Contains myList
        System.out.println("5 = " + myList.contains(5) + "\n");

        //indexOf myList
        System.out.println("Number 6 in " + myList.indexOf(6) + " position." + "\n");

        //void add myList
        myList.add(7, 15);
        System.out.println("myList after a values: ");
        for (int i = 0; i < myList.size(); i++) {

        }
    }
}
