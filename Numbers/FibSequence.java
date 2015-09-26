public class FibSequence {

    private final int nTh;
    private final int mode;

    //specifies whether to go to the nth step of the fibonacci, or to that number
    public static final int TO_NTH = 0;
    public static final int TO_NUM = 1;

    public FibSequence(int nTh, int mode) {
        this.nTh = nTh;
        this.mode = mode;
    }

    public void printFibSequence() {
        this.printStarting();
        if(this.mode == TO_NTH) {
            this.doNth();
        } else {
            this.doToNum();
        }
        System.out.println();
        System.out.println();
    }

    private void printStarting() {
        System.out.print("Printing fibonacci sequence ");
        if(this.mode == TO_NTH) {
            System.out.println("to Nth iteration of " + this.nTh);
        } else {
            System.out.println("to number of " + this.nTh);
        }
        System.out.println();
    }

    private void doNth() {
        for(int i = 0; i < this.nTh; i++) {
            if(i == 0) {
                System.out.print("0");
            } else if(i == 1) {
                System.out.print("1");
            } else {
                System.out.print(this.recFib(i));
            }
            System.out.print(", ");
        }
    }

    private void doToNum() {
        int lastFib = 0, i = 0;
        while(lastFib < this.nTh) {
            lastFib = recFib(i);
            System.out.print(lastFib + ", ");
            i++;
        }
    }

    private int recFib(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return recFib(n-1) + recFib(n-2);
        }
    }

    public final int getNTH() {
        return this.nTh;
    }

    public final int getMode() {
        return this.mode;
    }

    public static void main(String[] args) {
        FibSequence fib1 = new FibSequence(20, TO_NTH);
        fib1.printFibSequence();
        FibSequence fib2 = new FibSequence(500, TO_NUM);
        fib2.printFibSequence();
    }
}
