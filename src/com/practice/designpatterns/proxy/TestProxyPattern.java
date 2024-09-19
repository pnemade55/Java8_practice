package com.practice.designpatterns.proxy;

public class TestProxyPattern {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");

        try {
            executor.runCommand("ls -ltr");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}
