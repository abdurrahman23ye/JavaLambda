package pratic;

import java.util.Arrays;

public class Utulities {
    int a=0;

    public static void boslukluYazdirInt(int a){System.out.print(a+" ");}
    public static void boslukluYazdirDouble(double a){System.out.print(a+" ");}
    public static void boslukluYazdirString(String a){System.out.print(a+" ");}
    public static void boslukluYazdirString(String[] a){System.out.print(Arrays.toString(a));}
    public static void satirliYazdirString(String a){System.out.println(a);}
    public static int kareAlInt(int a){return a*a;}
    public static boolean ciftSayilarDondurInt(int a){return a%2==0;}
    public static boolean tekSayilarDondurInt(int a){return a%2==1;}

}
