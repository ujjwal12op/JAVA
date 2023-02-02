
    class calc{
        public int add(int n1,int n2){
                int result=n1+n2;
                return result;
        }
        public int add(int n1,int n2,int n3){
                int result=n1+n2;
                return result;
        }
        public int add(byte n1,byte n2){
                int result=n1+n2;
                return result;
        }
    }
public class overloading {
    public static void main(String[] args) {
        calc obj=new calc();
        int result=obj.add(2, 3,6);
        System.out.println(result);
    }
    
}
