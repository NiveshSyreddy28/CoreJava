package com.corejava.zemoso.lambdasandstreams.methodreference;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        //Method Reference
        //Reference to a static method
        Calculator myCalculator = ScientificCalculator::addition;
        myCalculator.add(10,20);

        //Reference to a non-static method
        // Instantiate the class
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Calculator calculator = scientificCalculator::addTwoNumbers;
        calculator.add(2,8);

        //Reference to constructor
        Messenger messenger = Message::new;
        messenger.getMessage("Don't quit");
    }
}
