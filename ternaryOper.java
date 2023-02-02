public class ternaryOper {
    public static void main(String[] args) {
        int a,b,c;
        a=12;
        b=13;
        c=14;
        String res=(a<b && a<c)? (b<c && b<a)?  "the smallest element is a":"the smallest element is c":"the smallest element is b";
        

        // String result=(a<b)? "a is lesser value":"b is the lesser value";
        // System.out.println(result);

        if(a<b && a<c){
            System.out.println("the smallest element is a");
        }
        
        else if(b<c && b<a){
            System.out.println("b is lesser");
            }
        
        else{
            System.out.println("c is the smallest");
        }
        }
    }    

