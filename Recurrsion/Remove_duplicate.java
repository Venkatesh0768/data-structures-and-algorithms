public class Remove_duplicate {


    
    public static void remove_duplicates(String str , int idx , StringBuilder newstr, boolean map[] ){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam 
        char currstr = str.charAt(idx);
        if(map[currstr - 'a'] == true){
            remove_duplicates(str, idx+1, newstr, map);
        }
        else{
            map[currstr - 'a'] = true;
            remove_duplicates(str, idx+1, newstr.append(currstr), map);
        }
    }


    public static void main(String[] args) {
        String str = "appnnacollage";
        remove_duplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
