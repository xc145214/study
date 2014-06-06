package c03;

import java.util.Random;

public class MathOps {

	//create a shorthand  to saving  typing:
	static void prt(String s){
		System.out.println(s);
	}

	//shorthand to print a string and int
	static void pInt(String s,int i){
		prt(s + " = "+ i);
	}
	//shorthand to pring a string and float
	static void pFlt(String s,float f){
		prt(s + " = "+ f);
	}
	
	public static void main(String[] args) {
		//create a random number generator
		//seeds with current time by default;
		Random rand = new Random();
		int i,j,k;
		
		//% limits maxinum value to 99
		j = rand.nextInt()%100;
		k = rand.nextInt()%100;
		pInt("j",j);
		pInt("k",k);
		i = j + k;
		pInt("j+k ",i);
		i = j - k;
		pInt("j-k ",i);
		i = j * k;
		pInt("j*k ",i);
		i = j / k;
		pInt("j/k ",i);
		i = j % k;
		pInt("j%k ",i);
		
		//Floating nubmer tests
		float u,v,w;
		v = rand.nextFloat();
		w = rand.nextFloat();
		pFlt("v",v);
		pFlt("w",w);
		u = v + w; pFlt("v+w",u);
		u = v - w; pFlt("v-w",u);
		u = v * w; pFlt("v*w",u);
		u = v / w; pFlt("v/w",u);
		
		u += v; pFlt("u += v",u);
		u -= v; pFlt("u -= v",u);
		u *= v; pFlt("u *= v",u);
		u /= v; pFlt("u /= v",u);
	}

}
