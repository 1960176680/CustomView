package com.example.administrator.customview;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void getString(){
        try {
            String a="http://login.cainiao.com/cplogin.htm?loginToken="+URLEncoder.encode("6-VUH8MRfrKWDxG1xrT_bw","utf-8")+"&redirectUrl="+URLEncoder.encode("http://m.fly.cainiao.com","utf-8");
            System.out.print("a="+a);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }




}