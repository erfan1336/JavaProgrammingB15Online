package repl_problems;

/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year,
this is a simple implementation of the algorithm. You will need to use loops to create it.
Show 10 years of growth of the Utopian Tree.

Output:
year 1 - growth 1 cm
tree size: 1cm

i < 10;
i ++;

1st year --> growth = 1 cm --> size = 1 cm
2nd year --> growth = 1 cm --> size = 2 cm
3nd year --> growth = 1 cm --> size = 3 cm
4th year --> growth = 2 cm --> size = 5 cm
5th year --> growth = 2 cm --> size = 7 cm

 */

public class P123_TreeGrowthSize {

    public static void main(String[] args) {

        int growth = 1;
        int size = 0;
        int year = 1;

        for (int i = 1; i <= 10 ; i++) {

            if (i >=1 && i <=3 ){
                growth = 1;
                size += 1;
            }
            if (i> 3 && i<= 10){
                growth =2;
                size += 2;
            }

            System.out.println("Year " + i + "  growth  " + growth + " cm" );
            System.out.println("tree size = " + size);
        }



    }
}
