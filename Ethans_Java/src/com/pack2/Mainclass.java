package com.pack2;

import Operation.Addition;
import Operation.Maximum;

public class Mainclass {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Addition a1=new Addition();
			a1.acceptadd(10, 20);
			a1.acceptsub(10f, 20f, 5f);
			a1.add();
			a1.subtract();
			
			Maximum m1=new Maximum();
			m1.acceptmax2(10, 20);
			Maximum m2=new Maximum();
			m2.acceptmax3(4, 5, 6);
			m1.max2();
			m2.max3();
		
			
			

	}

}
