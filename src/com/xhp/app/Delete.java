package com.xhp.app;

import java.io.File;

/**
 * @author Administrator
 * path :file path
 * return :null
 */
public class Delete {
	public static void del(String path) {
		File file = new File(path);
		File[] f = file.listFiles();
		for(int i=0;i<f.length;i++ ) {
			if(f[i].isFile()) {
				f[i].delete();
			}else if(f[i].isDirectory()) {
				String a = f[i].getPath();
				del(a);
			}
			f[i].delete();
		}
	}
}
