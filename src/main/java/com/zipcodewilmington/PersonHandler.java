package com.zipcodewilmington;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        String result = "";
        int counter = 0;
        while (counter < personArray.length) {
            result += personArray[counter];
            counter++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < personArray.length; i++) {
            result += personArray[i];
        }
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for ( Person p: personArray) {
            System.out.println(p);
            result += p;
        }
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
