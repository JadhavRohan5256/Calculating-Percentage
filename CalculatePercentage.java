package practice.percentage;
import java.util.Scanner;
class CalculatePercentage{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Total Subject : ");
        byte n = cin.nextByte();
        String subject[] = new String[n];
        float marks[] = new float[n];
        byte outOf[] = new byte[n];
        System.out.println();
        for(byte i=0;i<n;++i){
            System.out.println("    **                                     **");
            System.out.println("    *****************************************");
            System.out.println("\t  Enter Subject "+(i+1)+" Details :-  ");
            System.out.println("    *****************************************");
            System.out.println("    **                                     **");
            System.out.println();
            System.out.print("Name Of Subject : ");
            subject[i] = cin.next();
            // System.out.println();
            System.out.print("Marks Obtained : ");
            marks[i] = cin.nextFloat();
            // System.out.println();
            System.out.print("Out of : ");
            outOf[i] = cin.nextByte();
            System.out.println();
        }
        float totalMarks = 0;
        short outOfTotal = 0;
        for(byte i=0;i<n;++i){
            totalMarks += marks[i];
            outOfTotal += outOf[i];
        }
        System.out.println(" **                                     **");
        System.out.println(" *****************************************");
        for(int i=0;i<n;++i){
            System.out.println("\t"+(i+1)+"  "+subject[i]+"  "+marks[i]+"  "+outOf[i]);
        }
        System.out.println(" *****************************************");
        System.out.println(" **                                     **");
        System.out.println();
        float ave = outOfTotal / 100;
        float percentage = totalMarks/ave;
        System.out.println();
        System.out.println(" **                                     **");
        System.out.println(" *****************************************");
        System.out.println("\t Your Total Percentage "+percentage+"%");
        System.out.println(" *****************************************");
        System.out.println(" **                                     **");
    }
}