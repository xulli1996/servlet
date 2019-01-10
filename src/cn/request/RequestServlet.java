package cn.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//从网页中读数据以及回写数据
@WebServlet("/request")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // accept parameter
        String value = req.getParameter("username");//username以网址连接中的?username=xxx的形式给出
        //为了防止中文乱码
        resp.setContentType("text/html;charset=utf-8");
        // rewrite data
        resp.getWriter().print("data:"+value);
        System.out.println(value);
    }
}
