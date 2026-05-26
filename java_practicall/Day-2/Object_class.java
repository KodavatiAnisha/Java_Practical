Main Methods in Object Class


1. toString()
Purpose

Converts an object into a readable string.

Useful for:

Printing objects
Debugging
Logging



Example
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString()
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Anisha", 21);

        // Automatically calls toString()
        System.out.println(s1);
    }
}

Output
Name: Anisha, Age: 21


2. equals(Object obj)
Purpose

Compares two objects.

Default behavior:

Checks memory address

Usually overridden to compare actual data.


Example

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    // Override equals()
    public boolean equals(Object obj) {

        Student s = (Student) obj;

        return this.name.equals(s.name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Anisha");
        Student s2 = new Student("Anisha");

        System.out.println(s1.equals(s2));
    }
}


Output
true



3. hashCode()
Purpose

Generates a unique integer representation for an object.

Used in:

HashMap
HashSet
Hashtable

If two objects are equal using equals(),
their hashCode() should also be equal.

Example
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    public int hashCode() {
        return name.hashCode();
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Anisha");

        System.out.println(s1.hashCode());
    }
}


4. getClass()
Purpose

Returns runtime class information of an object.

Useful for:

Reflection
Checking object type



Example

class Student {
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getName());
    }
}


Output
class Student
Student



5. clone()
Purpose

Creates a copy of an object.

Important:

Class must implement Cloneable


Example

class Student implements Cloneable {

    String name;

    Student(String name) {
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Student s1 = new Student("Anisha");

        Student s2 = (Student) s1.clone();

        System.out.println(s2.name);
    }
}



Output
Anisha