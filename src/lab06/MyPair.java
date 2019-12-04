/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Student
 * @param <T>
 * @param <U>
 */
public class MyPair<T, U> {

    public T _1stArg;
    public U _2ndArg;

    public MyPair(T _1stArg, U _2ndArg) {
        this._1stArg = _1stArg;
        this._2ndArg = _2ndArg;
    }

    @Override
    public String toString() {
        return "(" + _1stArg + ", " + _2ndArg + ")";
    }

    public MyPair<U, T> swap() {
        return new MyPair<>(_2ndArg, _1stArg);
    }

    public static void main(String args[]) {
        /**
         * Question B.
         */
        MyPair<String, Integer> p1 = new MyPair<>("Anders", 13);
        /**
         * Question C.
         */
        MyPair<String, Double> p2 = new MyPair<>("Phoenix", 39.7);
        /**
         * Question D. Cannot assign p1 = p2;
         */
        /**
         * Question E.
         */
        MyPair<String, Integer>[] grades = new MyPair[5];
        for (int i = 0; i < 5; i++) {
            grades[i] = new MyPair<>(String.valueOf((char) (i + 65)), i);
        }
        /**
         * Question F.
         */
        for (MyPair grade : grades) {
            System.out.println(grade);
        }
        /**
         * Question G. The value is the 2nd argument of the injected MyPair<>
         */
        MyPair<MyPair<Integer, Integer>, String> appointment
                = new MyPair<>(new MyPair<>(2, 5), "TEST");
        System.out.println(appointment._1stArg._2ndArg);
        /**
         * Question H.
         */
        MyPair pSwap = p1.swap();
        System.out.println(pSwap);

    }

}
