public class searchInString {
    public static void main(String[] args) {
        String str = "Adarsh";
        char key = 'f';
        System.out.println(search(str, key));
    }
    static boolean search(String str, char key){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(key==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
