package com.practice.designpatterns.proxy;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String cmd) {
        System.out.println("Running command : " + cmd +" at CommandExecutorImpl");
    }
}
