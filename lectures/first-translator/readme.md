First Example
=============

How to create a simple postfixed expressions translator
-------------------------------------------------------

The code must change the default notation of an expression to postfixed notation (or reverse polish notation). The follow example may be useful:
Input             Output
2+2               22+
2+3-4             23+4-


1 The Grammar
-----------
> expr ::= expr + term | expr -  term> | term <br/>
> term ::= **num** | **var**

The grammar suffers with the **left-recursion** problem and needs to be **left factored**.

After the elimination of the left-recursion, the grammar must be like the following:

> expr ::= term + expr | term - expr | term <br/>
> term ::= **num** | **var**

Finally, the grammar passed through a left-factoration:

> expr ::= term rest <br/>
> rest ::= + term rest | - term rest <br/>
> term ::= **num** | **var**  

