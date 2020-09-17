package com.sydauto.study;

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
    }
}