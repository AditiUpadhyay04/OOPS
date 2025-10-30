package polymorphism;

public class compileTime {

    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    double sum(double a , int b){
        return a + b;
    }
    double sum(int a , double b){
        return a + b;
    }
}
