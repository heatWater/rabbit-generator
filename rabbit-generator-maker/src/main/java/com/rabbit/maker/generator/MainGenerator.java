package com.rabbit.maker.generator;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.rabbit.maker.generator.file.DynamicFileGenerator;
import com.rabbit.maker.meta.Meta;
import com.rabbit.maker.meta.MetaManager;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author heatWater
 */
public class MainGenerator {
    public static void main(String[] args) throws TemplateException, IOException {

        Meta meta = MetaManager.getMetaObject();
        System.out.println(meta);

        // 输出的根路径
        String projectPath = System.getProperty("user.dir");
        String outputPath = projectPath + File.separator + "generated";
        if(!FileUtil.exist(outputPath)) {
            FileUtil.mkdir(outputPath);
        }

        // 读取resource路径
        ClassPathResource classPathResource = new ClassPathResource("");
        String inputResourcePath = classPathResource.getAbsolutePath();

        // Java 包的基础路径
        // com.rabbit
        String outputBasePackage = meta.getBasePackage();
        // com/rabbit
        String outputBasePackagePath = StrUtil.join("/", StrUtil.split(outputBasePackage, "."));
        // generated/src/main/java/com/rabbit/xxx
        String outputBaseJavaPackagePath = outputPath + File.separator + "src/main/java/" + outputBasePackagePath;


        String inputFilePath;
        String outputFilePath;

        // model.DataModel
        inputFilePath = inputResourcePath + File.separator + "templates/java/model/DataModel.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + "/model/DataModel.java";
        DynamicFileGenerator.doGenerateByPath(inputFilePath, outputFilePath, meta);

    }

}
