package Arrays_and_Strings.Questions.Is_Unique;

//Q Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
//cannot use additional data structures?

//TC: O(n^2)

public class Naive {
    public static void main(String[] args) {
        String str="acba";
        System.out.println(isUnique(str));
    }
    static boolean isUnique(String str){

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
