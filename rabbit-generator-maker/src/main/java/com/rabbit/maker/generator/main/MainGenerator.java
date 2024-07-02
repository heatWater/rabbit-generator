package com.rabbit.maker.generator.main;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.rabbit.maker.generator.JarGenerator;
import com.rabbit.maker.generator.ScriptGenerator;
import com.rabbit.maker.generator.file.DynamicFileGenerator;
import com.rabbit.maker.meta.Meta;
import com.rabbit.maker.meta.MetaManager;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author heatWater
 */
public class MainGenerator extends GenerateTemplate{

    @Override
    protected String buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
//        super.buildDist(outputPath, sourceCopyDestPath, jarPath, shellOutputFilePath);
        System.out.println("不要给我输出 dist 啦！");
        return "";
    }
}
