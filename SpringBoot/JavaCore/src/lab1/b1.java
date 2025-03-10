package lab1;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên của bạn:");
        String name = input.nextLine();
        System.out.println("Nhập tuổi:");
        int age = input.nextInt();
        System.out.println("Nhập điểm toán");
        float toan = input.nextFloat();
        System.out.println("Nhập điểm tin:");
        float tin = input.nextFloat();
        System.out.println("Nhập điểm Văn");
        float vv = input.nextFloat();
        float dtb = (toan + tin + vv) / 3;
        System.out.println("Sinh viên: "+name+", "+age+"Tuổi");
        System.out.println("Điểm trung bình:"+dtb);
    }
}
