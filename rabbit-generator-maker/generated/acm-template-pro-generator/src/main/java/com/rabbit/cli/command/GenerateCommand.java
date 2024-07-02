package com.rabbit.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.rabbit.generator.MainGenerator;
import com.rabbit.model.DataModel;
import lombok.Data;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;


@Command(name = "generate", description = "生成代码", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {

        @Option(names = {"--needGit"}, arity = "0..1", description = "是否生成 .gitignore 文件", interactive = true, echo = true)
        private boolean needGit = true;

        @Option(names = {"-l", "--loop"}, arity = "0..1", description = "是否生成循环", interactive = true, echo = true)
        private boolean loop = false;

            /**
            * 核心模板
            */
            static DataModel.MainTemplate mainTemplate = new DataModel.MainTemplate();

            @Command(name = "mainTemplate")
            @Data
            public static class MainTemplateCommand implements Runnable {
            @Option(names = {"-a", "--author"}, arity = "0..1", description = "作者注释", interactive = true, echo = true)
            private String author = "sean";
            @Option(names = {"-o", "--outputText"}, arity = "0..1", description = "输出信息", interactive = true, echo = true)
            private String outputText = "sum = ";

            @Override
            public void run() {
                mainTemplate.author = author;
                mainTemplate.outputText = outputText;
            }
            }

    public Integer call() throws Exception {
          System.out.println("输入核心模板配置：");
          CommandLine mainTemplateCommandLine = new CommandLine(MainTemplateCommand.class);
          mainTemplateCommandLine.execute(FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> modelInfo.allArgsStr  [in template "GenerateCommand.java.ftl" at line 22, column 57]

----
Tip: It's the step after the last dot that caused this error, not those before it.
----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${modelInfo.allArgsStr}  [in template "GenerateCommand.java.ftl" in macro "generateCommand" at line 22, column 55]
	- Reached through: @generateCommand indent="      " mode...  [in template "GenerateCommand.java.ftl" at line 66, column 17]
----

Java stack trace (for programmers):
----
freemarker.core.InvalidReferenceException: [... Exception message was already printed; see it above ...]
	at freemarker.core.InvalidReferenceException.getInstance(InvalidReferenceException.java:134)
	at freemarker.core.EvalUtil.coerceModelToTextualCommon(EvalUtil.java:481)
	at freemarker.core.EvalUtil.coerceModelToStringOrMarkup(EvalUtil.java:401)
	at freemarker.core.EvalUtil.coerceModelToStringOrMarkup(EvalUtil.java:370)
	at freemarker.core.DollarVariable.calculateInterpolatedStringOrMarkup(DollarVariable.java:104)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:63)
	at freemarker.core.Environment.visit(Environment.java:371)
	at freemarker.core.Environment.invokeMacroOrFunctionCommonPart(Environment.java:877)
	at freemarker.core.Environment.invokeMacro(Environment.java:813)
	at freemarker.core.UnifiedCall.accept(UnifiedCall.java:84)
	at freemarker.core.Environment.visit(Environment.java:335)
	at freemarker.core.Environment.visit(Environment.java:341)
	at freemarker.core.Environment.visit(Environment.java:377)
	at freemarker.core.IteratorBlock$IterationContext.executedNestedContentForCollOrSeqListing(IteratorBlock.java:321)
	at freemarker.core.IteratorBlock$IterationContext.executeNestedContent(IteratorBlock.java:271)
	at freemarker.core.IteratorBlock$IterationContext.accept(IteratorBlock.java:244)
	at freemarker.core.Environment.visitIteratorBlock(Environment.java:645)
	at freemarker.core.IteratorBlock.acceptWithResult(IteratorBlock.java:108)
	at freemarker.core.IteratorBlock.accept(IteratorBlock.java:94)
	at freemarker.core.Environment.visit(Environment.java:335)
	at freemarker.core.Environment.visit(Environment.java:341)
	at freemarker.core.Environment.process(Environment.java:314)
	at freemarker.template.Template.process(Template.java:383)
	at com.rabbit.maker.generator.file.DynamicFileGenerator.doGenerate(DynamicFileGenerator.java:50)
	at com.rabbit.maker.generator.main.GenerateTemplate.generateCode(GenerateTemplate.java:125)
	at com.rabbit.maker.generator.main.GenerateTemplate.doGenerate(GenerateTemplate.java:32)
	at com.rabbit.maker.Main.main(Main.java:15)
