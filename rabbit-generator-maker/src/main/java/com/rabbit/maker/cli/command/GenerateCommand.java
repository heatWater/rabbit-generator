package com.rabbit.maker.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.rabbit.maker.generator.file.FileGenerator;
import com.rabbit.maker.model.DataModel;
import lombok.Data;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

/**
 * generate 子命令
 * 这是代码生成器的核心代码，作用是接受参数并生成代码
 */
@Command(name = "generate", description = "生成代码", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {

    @Option(names = {"-l", "--loop"}, arity = "0..1", description = "是否循环", interactive = true, echo = true)
    private boolean loop;

    @Option(names = {"-a", "--author"}, arity = "0..1", description = "作者", interactive = true, echo = true)
    private String author = "sean";

    @Option(names = {"-o", "--outPutText"}, arity = "0..1", description = "输出文本", interactive = true, echo = true)
    private String outputText = "sum = ";

    @Override
    public Integer call() throws Exception {
//        DataModel dataModel = new DataModel();
//        BeanUtil.copyProperties(this, dataModel);
//        System.out.println("配置信息：" + dataModel);
//        FileGenerator.doGenerate(dataModel);
        return 0;
    }
}
