package AllJavaPraticeAlgorithums;
public class BinaryGapAlgorithum {
    /*A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
Write a function:
class Solution { public int solution(int N); }
that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..2,147,483,647].*/
    public int solution(int N) {
        // write your code in Java SE 8

        String binary = Integer.toBinaryString(N);
        int[] table = new int[binary.length()];

        for (int i=0;i<binary.length();i++){
            int number = Integer.parseInt(binary.substring(i,i+1));
            table[i] = number;
        }

        int resu = 0;
        int res = 0;
        for (int i=0;i<table.length;i++){
            if (table[i] == 1){
                if (resu > res){
                    res = resu;
                }
                resu = 0;
            }else {
                resu++;
            }
        }

        return res;
    }
    public static void main(String args[]){
    BinaryGapAlgorithum b = new BinaryGapAlgorithum();
    int N =1024;
    System.out.println("binary gap::"+b.solution(N));
    }
}
