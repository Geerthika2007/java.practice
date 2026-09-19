class Reverse{
    public static void main(String[] args) {
        String str="Hello World";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String reversed=sb.toString();
        System.out.println("The reversed string is:"+reversed);
        
        
    }
}