import java.util.Scanner;

public class RataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i ;
        int j ;
        float nilaiMhs, totalNilai, rataNilai;

        for (i=1; i<=5; i++) {
             totalNilai=0;
             System.out.println("Input nilai mahasiswa ke-" +i);
            for (j = 1; j <= 5; j++){
                System.out.print("Nilai ke-" +j + " = ");
                nilaiMhs=sc.nextFloat();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " = " + rataNilai);
        }       
    }
    
}