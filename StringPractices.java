class StringPractices{
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("Abc");
      
        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));
        }
    System.out.println(str1 == str2);
    //System.out.println(str1.compareTo(str2)); // true, because string literals are interned
    //System.out.println(str1.equalsIgnoreCase(str2)); // true, because the content is the same
    }
}
