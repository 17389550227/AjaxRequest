package com.sgo.controller;

import com.alibaba.fastjson.JSONObject;
import com.sgo.dao.QueryDao;
import com.sgo.entity.Province;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author : sgo丶赵泽宏
 * @version : 1.0
 * @create : 2022/8/19 14:26
 * @Description :
 */
public class QueryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String id1 = request.getParameter("id");
        Province province = QueryDao.queryProvince(Integer.parseInt(id1));
        System.out.println(province);
        //使用JSONObject将java对象转成一个json字符串
        String s = JSONObject.toJSONString(province);
        response.setContentType("application/json;charset=utf-8");//设置发送数据的格式，和编码格式；
        PrintWriter writer = response.getWriter();
        writer.println(s);
        writer.flush();//清空缓存
        writer.close();//关闭流
    }
}
