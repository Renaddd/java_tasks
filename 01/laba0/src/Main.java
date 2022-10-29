public class Main
{

    public static void main(String[] args){
        System.out.println("Занятие 1 ");

        System.out.println("Unit № 1: ");
        System.out.println("Hello World");

        System.out.println("Unit № 2: ");
        int u2 = 121;
        System.out.println(u2);

        System.out.println("Unit № 3: ");
        int u3 = 0;
        u3 = u3 + 1;
        u3 += 1;
        ++u3;
        System.out.println(u3);

        System.out.println("Unit № 4: ");
        int u4_1 = 3;
        int u4_2 = 9;

        var u4_3 = u4_1;
        u4_1 = u4_2;
        u4_2 = u4_3;

        u4_1 += u4_2;
        u4_2 = u4_1 - u4_2;
        u4_1 -= u4_2;
        System.out.println(u4_1+", "+u4_2);

        System.out.println("Unit № 5: ");
        int u5_1 = 5;
        int u5_2 = 7;
        System.out.println(Math.sqrt(u5_1*u5_1 + u5_2*u5_2));

        System.out.println("Unit № 6: ");
        int u6 = 299212;
        System.out.println(u6 % 10);

        System.out.println("Unit № 7: ");
        int u7 = 2479821;
        System.out.println((u7 % 100 - u7 % 10)/10);

        System.out.println("Unit № 8: ");
        int u8 = 32;
        System.out.println(u8/10);

        System.out.println("Unit № 9: ");
        System.out.println(U9(40));

        System.out.println("Unit № 10: ");
        System.out.println(U10(22, 61));

        System.out.println("Unit № 11: ");
        System.out.println(U11(121, 11));

        System.out.println("Unit № 12: ");
        System.out.println(U12(-2, 19, -2, 7));
    }
    public static int U9(int u9){
        return u9 - 21;
    }
    public static int U10(int u10_1, int u10_2){
        return (u10_1 + u10_2)/2;
    }
    public static double U11(int u11_1, int u11_2){
        return Math.sqrt(u11_1*u11_2);
    }
    public static double U12(double u12_1, double u12_2, double u12_3, double u12_4){
        var u12_5 = u12_1 - u12_3;
        var u12_6 = u12_2 - u12_4;
        return Math.sqrt(u12_5*u12_5 + u12_6*u12_6);
    }
}