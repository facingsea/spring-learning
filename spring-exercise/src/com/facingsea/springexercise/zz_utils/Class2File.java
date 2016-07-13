package com.facingsea.springexercise.zz_utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.InvalidParameterException;

import org.apache.commons.lang3.StringUtils;

/**
 * 将class字节码输出到文件
 * @author wangzhf
 *
 */
public class Class2File {

	/**
	 * 将class字节码写出到指定文件中，适用于JDK动态代理生成的代理对象
	 * @param name
	 * @param targetPath
	 * @param interfaces
	 */
	public static void writeClass2File(String name, String targetPath, Class[] interfaces){
		if(StringUtils.isBlank(name) || StringUtils.isBlank(targetPath) || interfaces == null){
			throw new InvalidParameterException("the parameters must not be null.");
		}
		if(interfaces.length > 65535){
			throw new IllegalArgumentException("interface limit exceeded");
		}
		byte[] bytes = sun.misc.ProxyGenerator.generateProxyClass(name, interfaces);
		write(targetPath, bytes);
	}
	
	public static void writeClass2File(String targetClassName, Class targetClass, String parentDir){
		String path = parentDir.endsWith(File.separator) ? (parentDir + targetClassName + ".class") : (parentDir + File.separator + targetClassName + ".class");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(bos);
			oos.writeObject(targetClass);
			oos.flush();
			byte[] bs = bos.toByteArray();
			write(path, bs);
		} catch (Exception e) {
			try {
				if(oos != null){
					oos.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					bos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	private static void write(String targetPath, byte[] bytes){
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(targetPath);
			out.write(bytes);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null ){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
