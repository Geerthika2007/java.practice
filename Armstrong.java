class Armstrong{
    public static void main(String[] args){
        System.out.println("enter a number");
        int n=0; // Initialize n
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}