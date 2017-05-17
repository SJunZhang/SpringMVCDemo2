package com.zhang.springmvc.upload;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;


/**
 * 一个简单文件上传的Controller
 * @author DELL
 *
 */
@Controller
public class UploadFile {
	
	@RequestMapping(value="/uploadFile",method=RequestMethod.POST)
	public String upload(HttpServletRequest request) throws IOException{
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		if(multipartResolver.isMultipart(request)){
			MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
			Iterator iter = multipartHttpServletRequest.getFileNames();
			while(iter.hasNext()){
				MultipartFile file  = multipartHttpServletRequest.getFile(iter.next().toString());
				if(file!=null){
					String path = "D:\\springUpload\\"+file.getOriginalFilename();
					file.transferTo(new File(path));
				}
			}
		}
		return "html";
	}

}
