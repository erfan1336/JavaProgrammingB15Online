package repl_problems;

public class P91_PossibleCombinations {
    public static void main(String[] args) {


        for (char kchar = 'z'; kchar >= 'v'; kchar--)
            for (char ichar = 'z'; ichar >= 'v'; ichar--){
                    System.out.print(kchar + " ");
                System.out.println(ichar + " ");
            }
        }


    }

