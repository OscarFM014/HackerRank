class ReverseInteger {
    public static int reverse(int x) {
        String str = String.valueOf(x);
        String result = "";
        
        for(int i = str.length() - 1; i >= 0; i--){
            if (str.charAt(i) != '0' && str.charAt(i) != '-')
                result = result + str.charAt(i);
        }

        int re = Integer.parseInt(result);

        if (x < 0){
            re = re * -1;
        }

        if (result == "")
            return 0;
            
        return re;

        
        
    }

    public static void main (String args[]){
        System.out.println(reverse(0));
    }
}