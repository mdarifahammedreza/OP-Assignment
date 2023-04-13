package assignment.Q_4;

public class Test {
    public static void testFruit(Fruit f){
        System.out.println("----Printing Detail-----");
        if(f.hasFormalin()){
            System.out.println("Do not eat the "+f.getName()+".");
            System.out.println(f);
        }else{
            System.out.println("Eat the "+f.getName()+".");
            System.out.println(f);
        }
    }
    public static void main(String [] args){
        Mango m = new Mango();
        testFruit(m);
        Jackfruit j = new Jackfruit();
        testFruit(j);
    }
}
/*
        ----Printing Detail-----
        Do not eat the Mango.
        Mangos are bad for you
        ----Printing Detail-----
        Eat the Jackfruit.
        Jackfruits are good for you
*/
