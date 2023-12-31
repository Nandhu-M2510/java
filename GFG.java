import java.util.*;
class Complex 
{
    int real, imaginary;
    Complex()
    {
    }
    Complex(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }
    Complex addComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }
    Complex subtractComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp;
    }
	Complex multiplyComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real*C2.real;
        temp.imaginary = C1.imaginary*C2.imaginary;
        return temp;
    }
    void cn()
    {
        System.out.println("Complex number: "
                           + real + " + "
                           + imaginary + "i");
    }
}
class GFG
 {
    public static void main(String[] args)
    {
 
        Complex C1 = new Complex(8,4);
        C1.cn();
        Complex C2 = new Complex(6,2);
        C2.cn();
        Complex C3 = new Complex();
        C3 = C3.addComp(C1, C2);
        System.out.print("Sum of ");
        C3.cn();
        C3 = C3.subtractComp(C1, C2);
        System.out.print("Difference of ");
        C3.cn();
		C3 = C3.multiplyComp(C1, C2);
        System.out.print("Multiplication of ");
        C3.cn();
    }
}