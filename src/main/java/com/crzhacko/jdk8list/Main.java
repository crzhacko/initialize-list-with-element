package com.crzhacko.jdk8list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> myFamily = new ArrayList<String>(){{
            add("Tommy");
            add("Jerry");
            add("Jolly");
        }};
        System.out.println(myFamily);

        List<String> whoIsJolly = Arrays.asList("Who", "is", "Jolly");
        System.out.println(whoIsJolly);

        List<String> myDaughter = Stream.of("She", "is", "my", "daughter").collect(Collectors.toList());
        System.out.println(myDaughter);

        List<String> imSoHappyForHer = Collections.singletonList("I'm so happy.");
        System.out.println(imSoHappyForHer);
    }

}
