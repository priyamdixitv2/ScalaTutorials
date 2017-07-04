///*
//* Functional is driven by maily two ideas:
//* 1. Fuctions are first class values.
//* 2. immutable DS
//* Higher order Functions
//* 1. fuctions can be passed as parameter and return function
//* */
//
//def sum (f:Int => Int,a:Int,b:Int): Int= if(a>b) 0 else f(a)+sum(f,a+1,b)
//
//def id(x:Int):Int=x
//def cude()