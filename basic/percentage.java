import java.util.Scanner;
class test{
    public static void main(String[] args){
        float phy, chem,eng, maths,comp;
        double total,percentage,average;
        Scanner op = new Scanner(System.in);
        // total marks obtained
        System.out.println("Enter the marks of 5 subjects......");
        System.out.printf("Enter the marks of  phy : ");
        phy=op.nextFloat();
        System.out.printf("Enter the marks of  chem : ");
        chem=op.nextFloat();
        System.out.printf("Enter the marks of  eng : ");
        eng=op.nextFloat();
        System.out.printf("Enter the marks of  maths : ");
        maths=op.nextFloat();
        System.out.printf("Enter the marks of  comp : ");
        comp=op.nextFloat();
        
        // calculation of average and percentage
        total=phy+chem+eng+maths+comp;
        average = (total / 5.0);
        percentage = (total / 500.0) * 100;
        
        // print all marks total marks, average, percentage
        System.out.println("total marks="+total);
        System.out.println("average marks="+average);
        System.out.println("percentage="+percentage);

        
        
        
    }
}
