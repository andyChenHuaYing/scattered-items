package org.alien.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/3/4.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class BasicUploadFileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputStream inputStream = req.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("E:" + File.separator + "tempFile");
        int n;
        byte[] bytes = new byte[1024];
        while ((n = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, n);
        }
        inputStream.close();
        fileOutputStream.close();

        req.setAttribute("result", "success");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
