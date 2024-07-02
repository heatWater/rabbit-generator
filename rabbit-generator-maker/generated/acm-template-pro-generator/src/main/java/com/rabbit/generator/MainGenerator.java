package com.rabbit.generator;

import com.rabbit.model.DataModel;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;




/**
 * ����������
 */
public class MainGenerator {

    /**
     * ����
     *
     * @param model ����ģ��
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(DataModel model) throws TemplateException, IOException {
        String inputRootPath = ".source/acm-template-pro";
        String outputRootPath = "F:/code/rabbit-generator/acm-template-pro";

        String inputPath;
        String outputPath;

        boolean needGit = model.needGit;
        boolean loop = model.loop;
        String author = model.mainTemplate.author;
        String outputText = model.mainTemplate.outputText;

        // groupKey = git
        if (needGit) {
                inputPath = new File(inputRootPath, ".gitignore").getAbsolutePath();
                outputPath = new File(outputRootPath, ".gitignore").getAbsolutePath();
                    StaticGenerator.copyFilesByHutool(inputPath, outputPath);
                inputPath = new File(inputRootPath, "README.md").getAbsolutePath();
                outputPath = new File(outputRootPath, "README.md").getAbsolutePath();
                    StaticGenerator.copyFilesByHutool(inputPath, outputPath);
        }
            inputPath = new File(inputRootPath, "src/com/rabbit/acm/MainTemplate.java.ftl").getAbsolutePath();
            outputPath = new File(outputRootPath, "src/com/rabbit/acm/MainTemplate.java").getAbsolutePath();
                DynamicGenerator.doGenerate(inputPath, outputPath, model);
            inputPath = new File(inputRootPath, ".gitignore").getAbsolutePath();
            outputPath = new File(outputRootPath, ".gitignore").getAbsolutePath();
                StaticGenerator.copyFilesByHutool(inputPath, outputPath);
            inputPath = new File(inputRootPath, "README.md").getAbsolutePath();
            outputPath = new File(outputRootPath, "README.md").getAbsolutePath();
                StaticGenerator.copyFilesByHutool(inputPath, outputPath);
        if(needGit) {
                inputPath = new File(inputRootPath, ".gitignore").getAbsolutePath();
                outputPath = new File(outputRootPath, ".gitignore").getAbsolutePath();
                    StaticGenerator.copyFilesByHutool(inputPath, outputPath);
        }
    }
}