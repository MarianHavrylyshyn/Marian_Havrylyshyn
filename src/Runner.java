public class Runner {
    public static void main(String[] args) {
printFibo();
    }
    public static void printFibo (){
        int i =0;
        int y =1;
        System.out.println(i);
        System.out.println(y);
        do{
            int temp = i+y;
            System.out.println(temp);
            i=y;
            y=temp;

        }
        while(i+y<1000);




        /*for (;i+y<1000;){
            int temp = i+y;
            System.out.println(temp);
            i=y;
            y=temp;
        }*/
    }
}
