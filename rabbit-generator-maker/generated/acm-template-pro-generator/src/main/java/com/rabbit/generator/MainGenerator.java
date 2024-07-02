package com.rabbit.generator;

import com.rabbit.model.DataModel;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成器
 */
public class MainGenerator {

    /**
     * 生成
     *
     * @param model 数据模型
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {
        String inputRootPath = "./source/acm-template-pro";
        String outputRootPath = "E:/txcode/rabbit-generator/acm-template-pro";

        String inputPath;
        String outputPath;

    	inputPath = new File(inputRootPath, "src/com/rabbit/acm/MainTemplate.java.ftl").getAbsolutePath();
    	outputPath = new File(outputRootPath, "src/com/rabbit/acm/MainTemplate.java").getAbsolutePath();
        DynamicGenerator.doGenerate(inputPath, outputPath, model);

    	inputPath = new File(inputRootPath, ".gitignore").getAbsolutePath();
    	outputPath = new File(outputRootPath, ".gitignore").getAbsolutePath();
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);

    	inputPath = new File(inputRootPath, "README.md").getAbsolutePath();
    	outputPath = new File(outputRootPath, "README.md").getAbsolutePath();
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);
    }
}