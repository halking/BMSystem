/**
 * 
 */
package com.hal.bms.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hal
 *
 */
@Controller
public class VerifyCodeController {
      
	   private  int  img_w  =80 ; 
	   private  int  img_h  = 30;
	   private  int  count = 4;
	   private  int  font_w = img_w / (count+2);
	   private  int  font_h  = img_h-4;
	   private  int  codeY  = img_h-6;
	   private  int  red = 0 , green = 0 ,blue = 0;
	   private  int   linecount=20;
	   
	   private char  codeArray[]  =  {  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
				'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	   
	public VerifyCodeController() {
		// TODO Auto-generated constructor stub
	} 
    public  VerifyCodeController(int w,int h,int l){
    	this.img_w = w;
    	this.img_h =h;
    	this.linecount = l;
    }
    @RequestMapping(value="/code")
    public void getCode(HttpServletRequest request,HttpServletResponse response,HttpSession session)
    		throws IOException{
    	
//    创建图像缓存
 	   BufferedImage  bimg = new BufferedImage(img_w, img_h,BufferedImage.TYPE_INT_RGB);
 	   Graphics2D  g2d  =   bimg.createGraphics();  //创建画笔
 	   g2d.setColor(Color.white);     //设置颜色
 	   g2d.fillRect(0, 0, img_w, img_h);   
// 	   设置字体
 	   Font font = new Font("微软雅黑", Font.BOLD, font_h);   
 	   g2d.setFont(font);
//画边框
 	   g2d.setColor(Color.GRAY);
 	   g2d.drawRect(0, 0, img_w-1, img_h-1);
// 	画干扰线   
 	   Random random = new Random();
 	   g2d.setColor(Color.DARK_GRAY);
 	   for (int i = 0; i < linecount; i++) {
		int sx  =   random.nextInt(img_w);
		int sy  = random.nextInt(img_h);
		int  ex = random.nextInt(15);
		int  ey  =random.nextInt(12);
		g2d.drawLine(sx, sy, ex, ey);
	}
 	   
 	   StringBuffer  code  =  new StringBuffer();
// 	生成随机数   
 	   for (int i = 0; i < count; i++) {
                String  codenum =  String.valueOf(codeArray[random.nextInt(36)]);
                red = random.nextInt(255);
                green = random.nextInt(255);
                blue = random.nextInt(255);
                
                g2d.setColor(new Color(red,green,blue));
                g2d.drawString(codenum, (i+1)*font_w, codeY);
                
                code.append(codenum).toString();
	}
 	   session.setAttribute("code", code);
 	   
 	   //禁止图像缓存
 	   response.setHeader("Pragma", "no-cache");
 	   response.setHeader("Cache-Control", "no-cache");
 	   response.setDateHeader("Expires", 0);
 	   
 	   response.setContentType("image/jpeg");
 	   
 	   //将图像输出到servlet输出流
 	   ServletOutputStream sos = response.getOutputStream();
 	   ImageIO.write(bimg, "jpeg", sos);
 	   sos.close();
    }
  
}
