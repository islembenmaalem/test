public class tp1 {
	public static void main(String[] arg) {
		 double res;
		if (arg[0].equals("+")) {
			res = Integer.parseInt(arg[1])+Integer.parseInt(arg[2]);
			System.out.println(arg[1]+" + "+arg[2]+" = "+res);
		}
		if (arg[0].equals("-")) {
			res = Integer.parseInt(arg[1])-Integer.parseInt(arg[2]);
			System.out.println(arg[1]+" - "+arg[2]+" = "+res);
		}
		if (arg[0].equals("*")) {
			res = Integer.parseInt(arg[1])*Integer.parseInt(arg[2]);
			System.out.println(arg[1]+" * "+arg[2]+" = "+res);
		}
		if (arg[0].equals("/")) {
			if (arg[2].equals("0")) 
				System.out.println("division par zeros impossible");
			else {
			res = Integer.parseInt(arg[1])/(double)Integer.parseInt(arg[2]);
			System.out.println(arg[1]+" / "+arg[2]+" = "+res);
		}}
	}
	}

	
