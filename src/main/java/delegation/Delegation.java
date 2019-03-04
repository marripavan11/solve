package delegation;

public class Delegation {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}

class Printer {
     private RealPrinter realPrinter = new RealPrinter();
     void print() {
         realPrinter.print();
     }
}

class RealPrinter {
    void print() {
        System.out.println("I'm Printing from Real Printer Class");
    }
}


