package Self_Practice;

import java.util.*;


public class ArraysList {

    public static void main(String[] args) {


        //it only Store the Object, NO primitive!!!!
        //ArrayList<int> list2 = new ArrayList<int>();
        //ArrayList<Integer> list2 = new ArrayList<Integer>();
        //ArrayList<Double> list2 = new ArrayList<>();

        System.out.println("--------------------------- List Creation --------------------------------------");
        List<String> topics = Arrays.asList("Java", "Selenium", "Database", "API");
        System.out.println("topics = " + topics);
        //topics.add(0,"C++"); <<--------------- CANNOT ADD OR REMOVE ITEMS FROM LIST
        //topics.remove("Selenium");

        topics.set(0, "Java is Awesome");
        System.out.println("topics = " + topics);
        System.out.println();

        //Copy everything inside the topics to topicsCopy --> convert it ArrayList object
        System.out.println("------------------------- Convert To ArrayList Object -------------------------------");
        List<String> topicsCopy = new ArrayList<>(topics);
        System.out.println("topicsCopy = " + topicsCopy);
        //add more strings
        topicsCopy.add("Interview Prep");
        System.out.println("topicsCopy = " + topicsCopy);

        System.out.println("-----------------------------------------------------------------------------------   ");

        //List.of method (After Java9 Array.asList() has been improved by List.of())
        List<String> oop = List.of("Abstraction", "Encapsulation", "Inheritance", "Polymorphism");
        List<String> oopCopy = new ArrayList<>(oop);
        System.out.println("oopCopy = " + oopCopy);

        List<String> oopLst = new ArrayList<>(List.of("Abstraction", "Encapsulation", "Inheritance", "Polymorphism"));
        System.out.println("oopLst = " + oopLst);


        //------------------------------------------------------------------------------------
        List<Double> prices = Arrays.asList(9.99, 3.67, 8.99, 65.66);
        //Create ArrayList Object with One shot method
        ArrayList<Double> oneShotPrices = new ArrayList<>(Arrays.asList(9.99, 3.67, 8.99, 65.66));
        System.out.println("oneShotPrices = " + oneShotPrices);

        int count = 0;
        for (Double each : prices){
            if (each > 9){
                count++;
            }
        }
        System.out.println("count of number larger than 9 = " + count);


        System.out.println("----------------------  Create Integer Objects ---------------------------------------");
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(129);
        nums1.add(222);
        System.out.println("nums1 = " + nums1);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(129);
        nums2.add(999);
        System.out.println("nums2 = " + nums2);

        System.out.println("-------------------------- Add nums2 ArrayList into nums1 ArrayList ------------------");
        nums1.addAll(nums2);
        System.out.println("nums1 after adding nums2 into it = " + nums1);

        //Arrays.List method will return a List Object that contains items it specified
        nums2.addAll(Arrays.asList(234, 456, 890, 1098));
        System.out.println("nums2 = " + nums2);

        nums1.retainAll(nums2);
        System.out.println("nums1 after retains (keep the common part) = " + nums1);

        //ArrayList Equality Check
        System.out.println("nums1.equals(nums2) = " + nums1.equals(nums2));

        //Sorting the ArrayList
        //2 ways to sort ArrayList Object
        //1st use Collections utility class
        System.out.println("------------------ Collection  sort/max/min -------------------------");
        Collections.sort(nums2);
        System.out.println("nums2 after sort = " + nums2);
        System.out.println("Collections.max((nums2)) = " + Collections.max((nums2)));
        System.out.println("Collections.min(nums2) = " + Collections.min(nums2));
        System.out.println("---------------------------------------------------------------------");

        //Reverse the sorted ArrayList nums2
        System.out.println("------------------ Reversing/Natural the ArrayList  -------------------------");
        Collections.sort(nums2, Comparator.reverseOrder());
        System.out.println("nums2 sorted reversed = " + nums2);

        Collections.sort(nums2, Comparator.naturalOrder());
        System.out.println("nums2 sorted natural order = " + nums2);
        System.out.println("-----------------------------------------------------------------------------");


        //Converting Array into ArrayList
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Nums array object = " + Arrays.toString(nums));

        //Converting into the list
        List<Integer> numsList = Arrays.asList(nums);
        System.out.println("numsList object = " + numsList);

        //Converting back to Array again
        Integer[] numsNewArray = numsList.toArray(new Integer[nums.length - 8]);
        System.out.println("numsNewArray = " + Arrays.toString(numsNewArray));

        Integer[] numsNewArray2 = numsList.toArray(new Integer[0]);
        System.out.println("numsNewArray2 with correct size = " + Arrays.toString(numsNewArray2));


    }
}

/*


        class Friends {

            public char Gender;
            public byte Age;
            public String Color;
            public String Nickname;

            public Friends(char Gender, byte Age, String Color, String Nickname) {
                this.Age = Age;
                this.Color = Color;
                this.Gender = Gender;
                this.Nickname = Nickname;
            }

        }

        class Arfat extends Friends {
            public Arfat(char Gender, byte Age, String Color, String Nickname) {
                super(Gender, Age, Color, Nickname);
            }
        }

        class Erfan extends Friends {
            public Erfan(char Gender, byte Age, String Color, String Nickname) {
                super(Gender, Age, Color, Nickname);
            }
        }

        class CallFriends {
            public static void main(String[] args) {
                Arfat c1 = new Arfat('M', (byte) 34, "White", "Erfan");
                Erfan c2 = new Erfan('M', (byte) 33, "White", "Erfan");

                List<Friends> list = Arrays.asList(c1, c2);
                byte totalAge = 0;
                for (Friends each : list) {
                    System.out.println("Each Age: " + each.Age);
                    totalAge += each.Age;
                }
                System.out.println("Total Age =" + totalAge);

                System.out.println("=================== For Loop ==========================");
                byte totalage = 0;
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("Each Age : " + list.get(i).Age);
                    totalage += list.get(i).Age;
                }
                System.out.println(totalage);
            }
        }
*/
