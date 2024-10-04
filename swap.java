 class swap 
{
    public static void main(String[] args) 
    {
        int x, y;
        x=10;
        y=20;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);                          
        System.out.println("y = " + y);

}
}
