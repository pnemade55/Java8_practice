package com.practice.problems.oops;

public enum Environment {

    TEST("Test Env"),
    DEV("Env Dev"),
    PREPROD("Env preProd"),
    PROD("Env Prod");

    public final String env;

    Environment(String env){
        this.env = env;
    }

    public String getEnv() {
        return env;
    }


}
