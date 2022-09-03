package intorduction;

public class iNeuron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9;
		for(int i=0;i<n;i++) {
			
			//print I
			for(int j=0;j<n;j++) {
				if(j==0)
					System.out.print("*");
			}
			System.out.print("  ");
			
			//print N
			for(int j=0;j<n;j++) {
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			System.out.print("  ");
			
			//print E
			for(int j=0;j<=n/2;j++) {
				if(j==0 || i==0 || i==(n-1)/2 || i==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			System.out.print(" ");
			
			//print U
			for(int j=0;j<=n/2;j++) {
				if(j==0 || i==n-1 || j==(n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			System.out.print(" ");
			
			//print R
			for(int j=0;j<=(n+1)/2;j++) {
				if(j==0 || (i==0 && j<=n/2)|| (i==n/2 && j<=n/2)||(j==(n+1)/2 && i!=0 && i!=n/2))
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			System.out.print(" ");
			
			//print O
			for(int j=0;j<=(n+1)/2;j++) {
				if((j==0 &&i!=0 && i!=n-1)|| (i==0 && j!=0 && j!= (n+1)/2)|| (i==n-1 && j!=0 && j!= (n+1)/2)||(j==(n+1)/2 &&i!=0 && i!=n-1))
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			System.out.print(" ");
			
			//print N
			for(int j=0;j<n;j++) {
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			
			System.out.println();
		}

	}

}
