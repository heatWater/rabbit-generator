package com.rabbit.model;

import lombok.Data;


/**
 * 动态模板配置
 */
@Data
public class DataModel {
            /**
             * 是否生成 .gitignore 文件
             */
        public boolean needGit = true;
            /**
             * 是否生成循环
             */
        public boolean loop = false;
        /**
         * 核心模板
         */
        public MainTemplate mainTemplate = new MainTemplate();

        /**
         * 用于生成核心模板文件
         */
        @Data
        public static class MainTemplate {
FreeMarker template error (DEBUG mode; use RETHROW in production!):
Macro "generateModel" has no parameter with name "intent". Valid parameter names are: indent, modelInfo

----
FTL stack trace ("~" means nesting-related):
	- Failed at: @generateModel intent="        " mode...  [in template "DataModel.java.ftl" at line 33, column 13]
----

Java stack trace (for programmers):
----
freemarker.core._MiscTemplateException: [... Exception message was already printed; see it above ...]
	at freemarker.core.Environment.newUndeclaredParamNameException(Environment.java:1143)
	at freemarker.core.Environment.setMacroContextLocalsFromArguments(Environment.java:1023)
	at freemarker.core.Environment.invokeMacroOrFunctionCommonPart(Environment.java:859)
	at freemarker.core.Environment.invokeMacro(Environment.java:813)
	at freemarker.core.UnifiedCall.accept(UnifiedCall.java:84)
	at freemarker.core.Environment.visit(Environment.java:371)
	at freemarker.core.IteratorBlock$IterationContext.executedNestedContentForCollOrSeqListing(IteratorBlock.java:321)
	at freemarker.core.IteratorBlock$IterationContext.executeNestedContent(IteratorBlock.java:271)
	at freemarker.core.IteratorBlock$IterationContext.accept(IteratorBlock.java:244)
	at freemarker.core.Environment.visitIteratorBlock(Environment.java:645)
	at freemarker.core.IteratorBlock.acceptWithResult(IteratorBlock.java:108)
	at freemarker.core.IteratorBlock.accept(IteratorBlock.java:94)
	at freemarker.core.Environment.visit(Environment.java:335)
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
	at com.rabbit.maker.generator.main.GenerateTemplate.generateCode(GenerateTemplate.java:115)
	at com.rabbit.maker.generator.main.GenerateTemplate.doGenerate(GenerateTemplate.java:32)
	at com.rabbit.maker.Main.main(Main.java:15)
