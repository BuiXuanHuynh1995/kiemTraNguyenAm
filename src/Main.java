import java.util.Scanner;

public class Main {
    public static void check(char c) {
        boolean isNguyenAm = false;
        switch (c) {
            case 'u':
            case 'e':
            case 'o':
            case 'a':
            case 'i':
            case 'U':
            case 'E':
            case 'O':
            case 'A':
            case 'I':
                isNguyenAm = true;
        }
        if (isNguyenAm==true){
            System.out.println(c +" la nguyen am");
        }else {
            if ((c>='a' && c<='z')||( c>='A'&& c<='Z')){
                System.out.println(c+" la phu am");
            }else {
                System.out.println("Khong nam trong ban chu cai");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chu cai: ");
        char ch = scanner.next().charAt(0);
        check(ch);
    }
}
