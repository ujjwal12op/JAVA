public class Assingment9 {
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i==0 && j<3 ||j==3 && i>0 && i<3 || i==3 && j<3)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("");
            for(int j=0;j<n;j++){
                if(j==1 || j==5||j==9 || i==10 && j>1 && j<5|| i==10 && j>5 && j<9 )
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<n;j++){
                if( i==0 && j>5 && j<9 || j==5 && i>0 && i<3 || i==3 &&  j>5 && j<9 || j==9 && i>3 && i<7 || i==7 && j>5 &&j<9)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
