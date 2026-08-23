package Class11Practicals;

/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static void main(String[] args){
        System.out.print("\fINPUT: ");
        int N = new java.util.Scanner(System.in).nextInt();
        String evenOutput = "OUTPUT(EVEN NUMBERS): ";
        String oddOutput = "OUTPUT(ODD NUMBERS): ";
        if (N % 2 == 1){
            evenOutput += "No possible combination   ";
        }
        int i, sum, j, flag = 0, sum1;
        //finding odd number sum
        for(i = 1; i <= N / 2 ;i++){
            sum = 0;
            for(j = i; sum < N; j+=2){
                sum += j;
            }
            if(sum == N){
                if(i % 2 == 1){
                    sum1 = 0;
                    for(j = i; sum1 < N; j+=2){
                        oddOutput += j + " + ";
                        sum1 += j;
                    }
                    if(N % 2 == 1){
                        break;
                    }
                    flag++;
                }
                else{
                    for(j = i, sum1 = 0; sum1 < N; j+=2){
                        evenOutput += j + " + ";
                        sum1 += j;
                    }
                    flag++;
                }
                if(flag == 2){
                    break;
                }
            }
        }
        System.out.print("\n"+oddOutput.substring(0, oddOutput.length()-2)+
            "\n"+evenOutput.substring(0, evenOutput.length()-2));
    }
}