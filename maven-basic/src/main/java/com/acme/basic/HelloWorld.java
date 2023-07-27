package com.acme.basic;

import java.security.SecureRandom;

public class HelloWorld {

  void sayHello() {
    SecureRandom sr = new SecureRandom();
    sr.setSeed(123456L); // Noncompliant
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
