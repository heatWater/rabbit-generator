package com.rabbit.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.rabbit.generator.MainGenerator;
import com.rabbit.model.DataModel;
import lombok.Data;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;


@Command(name = "generate", description = "���ɴ���", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {

        @Option(names = {"--needGit"}, arity = "0..1", description = "�Ƿ����� .gitignore �ļ�", interactive = true, echo = true)
        private boolean needGit = true;

        @Option(names = {"-l", "--loop"}, arity = "0..1", description = "�Ƿ�����ѭ��", interactive = true, echo = true)
        private boolean loop = false;

            /**
            * ����ģ��
            */
            static DataModel.MainTemplate mainTemplate = new DataModel.MainTemplate();

            @Command(name = "mainTemplate")
            @Data
            public static class MainTemplateCommand implements Runnable {
            @Option(names = {"-a", "--author"}, arity = "0..1", description = "����ע��", interactive = true, echo = true)
            private String author = "sean";
            @Option(names = {"-o", "--outputText"}, arity = "0..1", description = "�����Ϣ", interactive = true, echo = true)
            private String outputText = "sum = ";

            @Override
            public void run() {
                mainTemplate.author = author;
                mainTemplate.outputText = outputText;
            }
            }

    public Integer call() throws Exception {
          System.out.println("�������ģ�����ã�");
          CommandLine commandLine = new CommandLine(MainTemplateCommand.class);
          commandLine.execute("--author", "--outputText");
    DataModel dataModel = new DataModel();
    BeanUtil.copyProperties(this, dataModel);
            dataModel.mainTemplate = mainTemplate;
    MainGenerator.doGenerate(dataModel);
    return 0;
    }
}