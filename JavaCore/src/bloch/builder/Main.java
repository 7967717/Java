package bloch.builder;

import bloch.builder.BuilderEx;

/**
 * Created by RomanR on 04-Aug-14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new BuilderEx.Builder(1, 2).build());
        System.out.println(new BuilderEx.Builder(4, 5).setEl3(6).build());
    }
}
