public class Main{
    public static void main(String[] args){
        int x;
        //test1
        Sign sign1 = new Sign("ABC222DE" , 3);
        x = sign1.numberOfLines();
        System.out.println(x);
        String str;
        str = sign1.getLines();
        System.out.println(str);
       
        //test2
        Sign sign2 = new Sign("ABCD", 10);
        x = sign2.numberOfLines();
        System.out.println(x);
        str = sign2.getLines();
        System.out.println(str);

        //test3
        Sign sign3 = new Sign("ABCDEF", 6);
        x = sign3.numberOfLines();
        System.out.println(x);
        str = sign3.getLines();
        System.out.println(str);
    }
}