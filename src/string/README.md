# Data structure - String.

A string is an array of characters

- Be familiar with the basic operations in a string, especially the unique operations which we don't have in an array
- Understand the differences between different comparison functions;
- Determine whether the string is immutable or not in your favorite language and understand the impact of this feature;
- Be able to solve basic string-related problems.


- Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared. For example


     String str = "abc";

is equivalent to:

     char data[] = {'a', 'b', 'c'};
     String str = new String(data);

Here are some more examples of how strings can be used:

     System.out.println("abc");
     String cde = "cde";
     System.out.println("abc" + cde);
     String c = "abc".substring(2,3);
     String d = cde.substring(1, 2);


- String class is an immutable class whereas StringBuffer and StringBuilder classes are mutable.
- StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.StringBuffer is less efficient than StringBuilder.
- StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously. StringBuilder is more efficient than StringBuffer