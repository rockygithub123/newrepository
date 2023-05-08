public class StaticAndNonStatic {
   static int a1=9;
    public static void main(String[] args) {
        System.out.println("Am not good");
        rocky();
        new StaticAndNonStatic().ok();


    }
    public static void rocky()
    {
        int a=10;
        int b=10;
        System.out.println(a1+b);
    }
    public  void ok()
    {
        System.out.println(a1+a1);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }

}
