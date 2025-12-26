public class stirngtype {
    public static void main(String[] args) {
        //creating string
        String name = "Akshit sharma";
        System.out.println(name);

        //string method
        //length
        int length = name.length();
        System.out.println(length);

        //charat()
        char c = name.charAt(length -1);
        System.out.println(c);

        //equalmethod
        String name2 = "AkShit sharma";
        System.out.println(name.equals(name2));

        //equalIngnorecase
        System.out.println(name.equalsIgnoreCase(name2));

        String str1 = "remote";
        String str2 = "car";
        //checking ascii value
        System.out.println('r' + 0);
        System.out.println('c'+ 0);
        // compare to method
        int i9 = str1.compareTo(str2);
        System.out.println(i9);


        String str3 = "remote";
        String str4 = "remot";
        //comparetoIngnorecase
        System.out.println(str3.compareToIgnoreCase(str4));

        //substring()
        String name3 = "Amar panchal";
        String substring = name3.substring(5);
        String subString2 = name3.substring(2, 8);
        System.out.println(subString2);

        //toUppercase method
        System.out.println(name3.toUpperCase());

        //tolowercase
        System.out.println(name3.toLowerCase());

        //trim method
        System.out.println(name3.trim());

        //replace
        String newName = name3.replace("Amar", "Raj");
        System.out.println(newName);


        //contains
        System.out.println(name3.contains("pan"));

        //startwith
        System.out.println(name3.startsWith("Am"));

        //endwith
        System.out.println(name3.endsWith("al"));

        //isempty
        String a = " ";
        System.out.println(a.isEmpty());

        //isblanck
        System.out.println(a.isBlank());

        //lastindexof (string )
        int i1 = name3.lastIndexOf("a");
        int l1 = name3.lastIndexOf("a", 4);
        System.out.println(l1);

        //lastIndexof(char)
        int i2 = name3.lastIndexOf('a');
        System.out.println(i2);
        int i3 = name3.lastIndexOf('a', 1);
        System.out.println(i3);

         //valueof
        int b = 10;
        String s = String.valueOf(b);
        System.out.println(s);

        //subsequence
        System.out.println(name3.subSequence(2, 8));


        //concatenation string
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);


        int age = 25;
        System.out.println("My name is " + firstName + " and I am " + age + " years old.");

         //concat method
        System.out.println(firstName.concat(lastName));

        //number and string
        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);

        //special chaarcter
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);


        //indexof(string)
        String m = "Hello, World!";
        System.out.println(m.indexOf("World"));

        //indexOf(strings, int i)
        String str = "Hello, World!";
        System.out.println(str.indexOf("l", 4));


        //tocharArray[]
        String str9 = "Hello";
        char[] chars = str9.toCharArray();
        for(char C : chars) {
            System.out.print(C + " ");
        }

        //intern - string pool with new keyword
        String last = "Ram";
        System.out.println(last);

        String last1 = new String("java");
        System.out.println(last1);

        String s1 = last1.intern();
        String s2 = "java";
        System.out.println(s2 == s1);

        //String format
        String s4 = String.format("Name: %s, Age: %d", "Akshit", 20);
        System.out.println(s4);


// string is a immutable  and
        //string buffer and string builder - is mutable in java means they all modification to the character without crating new object.

       // String a1 = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
       // sb.append("Hello");
       //  sb.insert(1, "java");
        //sb.replace(1, 3, "world");
        //sb.delete(1, 4);
       // sb.charAt(0);
      //  sb.length();
        sb.substring(1,  4);
        System.out.println(sb);

    // string buffer - is a class that allow us to create and modify a flexible sequence od character it is in thread safe
        // Creating a new StringBuffer
       StringBuffer t1 = new StringBuffer("Message");

       //t1.append("World!");
        //1.reverse();
     //  t1.delete(1, 3);
       // t1.insert(2, "Java");
        t1.replace(1, 3, "Python");


        System.out.println(t1);



        //ex -1 for differentiate
        long startTime, endTime;

        //using string
        startTime = System.currentTimeMillis();
        String b1 = "java";
        for(int i =0; i<10000; i++){
            b1 += "programming";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String time " + (endTime -startTime) + "ms");


        //using string builder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder  = new StringBuilder("java");
        for(int i =0; i<10000; i++){
            stringBuilder.append("programming");
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Builder time " + (endTime -startTime) + "ms");


        //using string buffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer  = new StringBuffer("java");
        for(int i =0; i<10000; i++){
            stringBuffer.append ("programming");
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Buffer time " + (endTime -startTime) + "ms");
    }
}
