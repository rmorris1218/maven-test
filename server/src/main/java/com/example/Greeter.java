/**
  * This is a package for greeting someone in the HelloWorld application
  *
  * @author Rob Morris
  * @version 0.1
  */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /**
  * This is a method that is used to generate a greeting for someone
  * visiting the page.
  * @param someone This is the name of the person visiting the package
  * @return String This is the full greeting message
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s! Built by maven :)", someone);
  }
}
