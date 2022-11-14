import java.util.Random;
import java.util.Scanner;
public class JawabanNo3 {
    public class InfoPlatNomor {
        int JumJenisPlat = 6;
        static int totalPlatNomor = 25;
        public static String[] infoPlatNomor = new String[]{"K-Kudus", "B-Jakarta", "AB-Jogja", "T-Karawang", "AD-Solo"};
        public static String[] K = new String[5];
        public static String[] B = new String[5];
        public static String[] AB = new String[5];
        public static String[] T = new String[5];
        public static String[] AD = new String[5];

        public static void PrintInfoPlatNomor() {
            int totalK = 0;
            for (int index = 0; index < K.length; index++) {
                if (K[index] != null) {
                    totalK++;
                }
            }
            int totalB = 0;
            for (int index = 0; index < B.length; index++) {
                if (B[index] != null) {
                    totalB++;
                }
            }
            int totalAB = 0;
            for (int index = 0; index < AB.length; index++) {
                if (AB[index] != null) {
                    totalAB++;
                }
            }
            int totalT = 0;
            for (int index = 0; index < T.length; index++) {
                if (T[index] != null) {
                    totalT++;
                }
            }
            int totalAD = 0;
            for (int index = 0; index < AD.length; index++) {
                if (AD[index] != null) {
                    totalAD++;
                }
            }
            System.out.println("Total Plat Kudus : " + totalK + "| Total Plat Jakarta: " + totalB + "| Total Plat Jogja: " + totalAB + "" +
                    "| Total Plat Karawang: " + totalT + "| Total Plat Solo: " + totalAD);
            System.out.println("Jumlah Seluruh Plat Nomor : " + "totalPlatNomor+ ");
            System.out.println();
        }

        public static void CheckIndexArray(String[] myArray, String plat) {
            int indexNow = 0;
            for (int index = 0; index < myArray.length; index++) {
                if (myArray[index] != null) {
                    indexNow = index + 1;
                }
            }
            if (indexNow < myArray.length) {
                myArray[indexNow] = plat;
            }
        }

        public static void simpanPlatNomor(int angkaRandom, String PlatNomor) {
            switch (angkaRandom) {
                case 1:
                    CheckIndexArray(K, PlatNomor);
                    System.out.println("Anda Mendapatkan Vaksin Pfizer");
                    PrintInfoPlatNomor();
                    break;
                case 2:
                    CheckIndexArray(B, PlatNomor);
                    System.out.println("Anda Mendapatkan Vaksin Sinopharm");
                    PrintInfoPlatNomor();
                    break;
                case 3:
                    CheckIndexArray(AB, PlatNomor);
                    System.out.println("Anda Mendapatkan Vaksin Moderna");
                    PrintInfoPlatNomor();
                    break;
                case 4:
                    CheckIndexArray(T, PlatNomor);
                    System.out.println("Anda Mendapatkan Vaksin Pfizer");
                    PrintInfoPlatNomor();
                    break;
                case 5:
                    CheckIndexArray(AD, PlatNomor);
                    System.out.println("Anda Mendapatkan Vaksin Sinopharm");
                    PrintInfoPlatNomor();
                    break;
            }
        }

        public static void inputPlatNomor() {
            Scanner inputData = new Scanner(System.in);
            while (true) {
                System.out.println("Plat Nomor = ");
                String PlatNomor = inputData.nextLine();
                if (PlatNomor.isBlank()) {
                    System.out.println("Plat Nomor Wajib Diisi ");
                    inputPlatNomor();
                } else {
                    Random hasilRandom = new Random();
                    int JenisRandom = hasilRandom.nextInt(6) + 1;
                    int JenisAngkaRandomRandom;
                    simpanPlatNomor(JenisRandom, PlatNomor);
                }
            }
        }

        public static void main(String[] args) {
            inputPlatNomor();
            //
        }
    }
}