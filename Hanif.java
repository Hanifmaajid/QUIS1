package hanif;

import java.util.Scanner;

public class Hanif {

    private static Scanner scanner;
    private static String nik, nama;
    private static double tesTulis, tesCoding, tesWawncara;
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int menu = 0;
        do{
            System.out.println("\n\nFORM PENDAFTARAN PT.UDIN");
            System.out.println("1. Android development");
            System.out.println("2. Web Development");
            System.out.println("3. Exit");
            System.out.print("Pilih Jenis Form : ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1:
                    inputForm();
                    subMenu(new Android(nik, nama, tesTulis, tesCoding, tesWawncara));
                    break;
                case 2:
                    inputForm();
                    subMenu(new Web(nik, nama, tesTulis, tesCoding, tesWawncara));
                    break;
            }
        } while(menu != 3);
    }
    
    private static void inputForm(){
        System.out.println("\n\nFORM PENDAFTARAN");
        System.out.print("Input NIK : ");
        nik = scanner.next();
        System.out.print("Input Nama : ");
        nama = scanner.next();
        System.out.print("Input Nilai Tes Tulis : ");
        tesTulis = scanner.nextDouble();
        System.out.print("Input Nilai Tes Coding : ");
        tesCoding = scanner.nextDouble();
        System.out.print("Input Nilai Tes Wawancara : ");
        tesWawncara = scanner.nextDouble();
    }
    
    private static void subMenu(Ujian ujian){
        int subMenu = 0;
        do{
            System.out.println("\n\nMenu");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu : ");
            subMenu = scanner.nextInt();
            
            switch(subMenu){
                case 1:
                    System.out.println("\n\nFORM EDIT");
                    System.out.print("Input Nilai Tes Tulis : ");
                    tesTulis = scanner.nextDouble();
                    System.out.print("Input Nilai Tes Coding : ");
                    tesCoding = scanner.nextDouble();
                    System.out.print("Input Nilai Tes Wawancara : ");
                    tesWawncara = scanner.nextDouble();
                    
                    ujian.editUjian(tesTulis, tesCoding, tesWawncara);
                    
                    break;
                case 2:
                    ujian.hasilUjian(nik, nama, tesTulis, tesCoding, tesWawncara);    
                    break;
            }
        } while(subMenu != 3);
    }
}
