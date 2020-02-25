public class lab3string{
    static int dlugosc(String str)
    {
        return str.length();
    }

    static int ile_razy_literka_wystepuje(String str, char znk)
    {
        int sum = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            if( str.charAt(i) == znk)
                sum++;
        }
        return sum;
    }

    static boolean czy_takie_same(String str1, String str2)
    {
        return str1.equals(str2);
    }

    static String wspak(String str)
    {
        String s = new String("");
        for(int i = str.length() - 1 ; i > -1 ; i--)
            s += str.charAt(i);
        return s;
    }

    static boolean czy_plaindrom(String str)
    {
        boolean tof = true;
        for(int i = 0 ; i < str.length()/2 ; i++)
        {
            if( str.charAt(i) != str.charAt(str.length()-1 - i))
            tof = false;
        }
        return tof;
    }

    static boolean czy_abecadlowe(String str)
    {
        boolean tof = true;
        for(int i = 1 ; i < str.length(); i++)
        {
            if(str.charAt(i) < str.charAt(i-1))
            tof = false;
        }
        return tof;
    }

    static String rot13(String str){
        String s = new String("");
        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                          'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                          'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                          'y', 'z'};
        for(int i = 0; i < str.length(); i++){
            Character c = (i==0) ? Character.toUpperCase(str.charAt(i)) : str.charAt(i) ;
                
            if(c == ' ')
                s += ' ';
            else 
                for(int k = 0; k < 26; ++k){
                    if(alfabet[k] == c|| alfabet[k] == Character.toLowerCase(c)){
                        s += (k == 0) ? Character.toUpperCase(alfabet[(k+13) % 26]): alfabet[(k+13) % 26];
                        break;
                    }
                }
        }
        return s;  
        
    }

}
