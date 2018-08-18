package amazon;

/*Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

        Note:
        The given integer is guaranteed to fit within the range of a 32-bit signed integer.
        You could assume no leading zero bit in the integer’s binary representation.
        Example 1:
        Input: 5
        Output: 2
        Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010.*/

public class NumberCompliment {
    public static void main(String[] args) {

        System.out.println(findComplementBetter(5));
    }

    public static int findComplement(int num) {


        char binary[] = Integer.toBinaryString(num).toCharArray();
        for(int i =0 ; i < binary.length ; i++){
            if(binary[i] == '0'){
                binary[i] = '1';
            }else{
                binary[i] = '0';
            }
        }

         return Integer.parseInt(new String(binary),2);

    }


    public static  int findComplementBetter(int num) {
        // 5
        System.out.println(Integer.highestOneBit(num));
        System.out.println(Integer.highestOneBit(num) << 1);
        System.out.println((Integer.highestOneBit(num) << 1)-1);

        int mask = (Integer.highestOneBit(num) << 1) - 1;

        num = ~num;

        System.out.println(Integer.toBinaryString(num));
        return num & mask;
    }
}
