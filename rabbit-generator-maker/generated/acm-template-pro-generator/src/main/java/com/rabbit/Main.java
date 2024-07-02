package com.rabbit;

import com.rabbit.cli.CommandExecutor;

public class Main {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();
        args = new String[]{"generate", "--needGit=false"};
        commandExecutor.doExecute(args);
    }
}
