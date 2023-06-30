package service;

import model.Complex;

public interface IComplexOperation {
    Complex mathOperation(Complex c1, Complex c2);
    void print(Complex complex);
}
