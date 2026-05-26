WRAPPER Class


Wrapper classes in Java are used to treat primitive values like objects.

Example:

int → Integer
char → Character
double → Double

Why they are needed:

Some Java features work only with objects

Example:

ArrayList<Integer> list = new ArrayList<>();

ArrayList cannot store normal int values directly.

Wrapper classes give useful methods
Integer.parseInt("123");

Converts string to number.

Wrapper objects can store null
Integer x = null;

Primitive int cannot store null.

Java automatically converts between primitive and wrapper
int a = 10;

Integer b = a; // autoboxing

Simple idea:

Primitive:

int

Wrapper object:

Integer

Wrapper class adds extra features and lets Java use the value as an object.