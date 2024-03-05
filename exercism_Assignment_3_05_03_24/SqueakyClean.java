class SqueakyClean {
    static String clean(String identifier) {
      
       String str="";
        for(int i=0;i<identifier.length();i++)
            {
                if(identifier.charAt(i)==' ') str+="_";
                else if(identifier.charAt(i)=='-' && Character.isLetter(identifier.charAt(i+1)))  
                    {   i++;
                        str+=(identifier.substring(i,i+1)).toUpperCase();
                    }
                    else if(identifier.charAt(i)=='3')
                        str+="e";
                else if(identifier.charAt(i)=='4')
                    str+='a';
                else if(identifier.charAt(i)=='0')
                    str+='o';
                else if(identifier.charAt(i)=='1')
                    str+='l';
                else if(identifier.charAt(i)=='7')
                    str+='t';
                else if(Character.isLetter(identifier.charAt(i)))  str+=identifier.charAt(i);
            }
        return str;
    }
}
