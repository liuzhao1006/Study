package com.sydauto.study;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.leshan.client.demo.LeshanClientDemo;
import org.eclipse.leshan.core.model.InvalidDDFFileException;
import org.eclipse.leshan.core.model.InvalidModelException;
import org.eclipse.leshan.core.model.ObjectLoader;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect () {
        RegisterDemo demo = new RegisterDemo();
        demo.demo();
//        try {
//            ObjectLoader.loadDdfResources("/models/", LeshanClientDemo.modelPaths, true);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InvalidModelException e) {
//            e.printStackTrace();
//        } catch (InvalidDDFFileException e) {
//            e.printStackTrace();
//        }
        // 构建参数
//        Options options = new Options()
//                .addOption("name",  true,"map-param")// 键值对参数，必须成对
//                .addOption("has", "bool-param");// bool型参数
//        // 解析
//        try {
//            CommandLine line = new DefaultParser().parse(options, null);
//
//            // 取值
//            System.out.println(line.hasOption("name"));
//            System.out.println(line.getOptionValue("name"));
//            System.out.println(line.hasOption("has"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        final StringBuilder PSKChapter = new StringBuilder();
        PSKChapter.append("\n .");
        PSKChapter.append("\n .");
        PSKChapter.append("\n ================================[ PSK ]=================================");
        PSKChapter.append("\n | By default Leshan demo use non secure connection.                    |");
        PSKChapter.append("\n | To use PSK, -i and -p options should be used together.               |");
        PSKChapter.append("\n ------------------------------------------------------------------------");

        final StringBuilder RPKChapter = new StringBuilder();
        RPKChapter.append("\n .");
        RPKChapter.append("\n .");
        RPKChapter.append("\n ================================[ RPK ]=================================");
        RPKChapter.append("\n | By default Leshan demo use non secure connection.                    |");
        RPKChapter.append("\n | To use RPK, -cpubk -cprik -spubk options should be used together.    |");
        RPKChapter.append("\n | To get helps about files format and how to generate it, see :        |");
        RPKChapter.append("\n | See https://github.com/eclipse/leshan/wiki/Credential-files-format   |");
        RPKChapter.append("\n ------------------------------------------------------------------------");

        final StringBuilder X509Chapter = new StringBuilder();
        X509Chapter.append("\n .");
        X509Chapter.append("\n .");
        X509Chapter.append("\n ================================[X509]==================================");
        X509Chapter.append("\n | By default Leshan demo use non secure connection.                    |");
        X509Chapter.append("\n | To use X509, -ccert -cprik -scert options should be used together.   |");
        X509Chapter.append("\n | To get helps about files format and how to generate it, see :        |");
        X509Chapter.append("\n | See https://github.com/eclipse/leshan/wiki/Credential-files-format   |");
        X509Chapter.append("\n ------------------------------------------------------------------------");
        System.out.println("PSKChapter:" + PSKChapter.toString());
        System.out.println("RPKChapter:" + RPKChapter.toString());
        System.out.println("X509Chapter:" + X509Chapter.toString());
    }
}