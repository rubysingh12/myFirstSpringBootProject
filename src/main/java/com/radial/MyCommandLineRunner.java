package com.radial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by gsingh on 3/31/2018.
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Hello From MyCommandLineRunner");
        System.out.println("Printing all comandline arguments");

        System.out.println(Arrays.toString(strings));

    }
}
