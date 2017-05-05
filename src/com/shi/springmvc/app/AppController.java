package com.shi.springmvc.app;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.HashMap;

import static com.sun.xml.internal.stream.Entity.ScannedEntity.DEFAULT_BUFFER_SIZE;

/**
 * Created by afinalstone on 17-5-4.
 */
@Controller
public class AppController {

    private HashMap<String,String> listData;
    File file;
    Gson gson;

    @ResponseBody
    @RequestMapping(value = "/insertJsonString")
    public String insertJsonString(@RequestParam(value = "methodName") String methodName, @RequestParam(value = "jsonString") String jsonString) {
        if(file == null){
            getListData();
            if(listData == null){
                listData = new HashMap<>();
            }
        }
        jsonString = jsonString.replace("%22", "\"")
                .replace("[", "{").replace("]", "}");
        listData.put(methodName,jsonString);
        String listStr = gson.toJson(listData);
        System.out.println("listData:" + listStr);
        string2File(listStr);
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/getJsonString")
    public String getJsonString(@RequestParam(value = "methodName") String methodName) {
        return getListData().get(methodName);
    }

    public HashMap<String,String> getListData(){
        if(file == null){
            file = new File("DataString");
            gson = new Gson();
        }
        String listStr =file2String(file);
        System.out.println(listStr);
        listData = gson.fromJson(listStr,HashMap.class);
        return listData;
    }

    /**
     * 将字符串写入指定文件(当指定的父路径中文件夹不存在时，会最大限度去创建，以保证保存成功！)
     *
     * @param jsonString  字符串
     * @return 成功标记
     */
    public boolean string2File(String jsonString) {
        PrintWriter pfp= null;
        try {
            pfp = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        pfp.print(jsonString);
        pfp.close();
        return true;
    }

    /**
     * 文本文件转换为指定编码的字符串
     *
     * @param file 文本文件
     * @return 转换后的字符串
     * @throws IOException
     */
    public String file2String(File file) {
        InputStreamReader reader = null;
        StringWriter writer = new StringWriter();
        try {
            reader = new InputStreamReader(new FileInputStream(file));
            //将输入流写入输出流
            char[] buffer = new char[DEFAULT_BUFFER_SIZE];
            int n = 0;
            while (-1 != (n = reader.read(buffer))) {
                writer.write(buffer, 0, n);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        //返回转换结果
        if (writer != null)
            return writer.toString();
        else return null;
    }

}
