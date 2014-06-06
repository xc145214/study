package c03;

import java.util.Random;

/**
 * 将整数转为2进制
 * @author hadoop
 *
 */
public class BitManipulation {

	static void pBinInt(String s,int i){
		System.out.println(s + ",int: "+ i + ",binary: ");
		System.out.print("  ");
		for (int j = 31; j >0; j--) {
			if(((1 << j) & i) != 0)
				System.out.print("1");
			else
				System.out.print("0");
			
		}
		System.out.println();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rand = new Random();
		int i = rand.nextInt();
		int j = rand.nextInt();
		pBinInt("-1",-1);
		pBinInt("+1",+1);
		
		int maxpos = 2147483647;
		pBinInt("maxpos",maxpos);
		int maxneg = -2147483648;
		pBinInt("maxneg",maxneg);
		pBinInt("i",i);
		pBinInt("～i",~i);
		pBinInt("-i", -i);
		pBinInt("j",j);
		pBinInt(" i & j ", i&j);
		pBinInt(" i|j " ,i|j);
		pBinInt(" i ^ j ", i^j);
		pBinInt(" i << 5",i << 5);
		pBinInt(" i >> 5",i >>5);
		pBinInt("(～i) >>5",(~i)>>5);
		pBinInt("i >>> 5",i >>> 5);
		pBinInt("(~i) >>> 5",(~i) >>> 5);
		
	}

}
