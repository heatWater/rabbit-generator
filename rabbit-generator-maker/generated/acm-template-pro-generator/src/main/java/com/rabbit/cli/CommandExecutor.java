package com.rabbit.cli;

import com.rabbit.cli.command.ConfigCommand;
import com.rabbit.cli.command.GenerateCommand;
import com.rabbit.cli.command.ListCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "acm-template-pro-generator", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable{

    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());
    }


    @Override
    public void run() {
        // ������������ʱ�������Ѻ���ʾ
        System.out.println("�������������������� --help �鿴������ʾ");
    }

    /**
     * ִ������
     *
     * @param args
     * @return
     */
    public Integer doExecute(String[] args) {
        return commandLine.execute(args);
    }

}
