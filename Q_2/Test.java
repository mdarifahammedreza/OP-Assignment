package assignment.Q_2;

public class Test {

        public int sum = 1;
        public int y = 2;
        private int x = 3;
        public Test(){
            sum = sum + 3;
            y = sum + y + x;
        }
        public Test(int a, int b){
            x = x + a;
            y = b + y + x;
        }
        public void methodA(){
            y = y + 7;
            x = y + 11;
            sum = x + y;
            System.out.println(x + " " + y+ " " + sum);
        }
        public void methodB(){
            y = y + 11;
            x = x + 33 + y;
            sum = sum + x + y;
            System.out.println(x + " " + y+ " " + sum);
        }
    public static void main (String[] args) {    Test t1 = new Test();
        Test t2 = new Test(1,4);
        t1.methodA();
        t2.methodA();
        t1.methodB();
        t2.methodB();
        }
    }


