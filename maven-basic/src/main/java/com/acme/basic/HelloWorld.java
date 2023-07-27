import java.security.SecureRandom;
package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    SecureRandom sr = new SecureRandom();
    sr.setSeed(123456L); // Noncompliant
    int v = sr.next(32);
    sr = new SecureRandom("abcdefghijklmnop".getBytes("us-ascii")); // Noncompliant
    v = sr.next(32);
    System.out.println("Hello World!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }
  
  void sayBye() {
	    //System.out.println("Bye World!");
	  }
  void sayByeBye() {
	    System.out.println("ByeBye World!");
	  }
}
