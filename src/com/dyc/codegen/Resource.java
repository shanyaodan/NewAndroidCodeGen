package com.dyc.codegen;

import java.io.IOException;
import java.io.InputStream;

public class Resource {


	public InputStream getBaseFragmentResource() throws IOException {
		return	this.getClass().getClassLoader().getResourceAsStream("com/dyc/codegen/temp/BaseFragment1.txt");
	}

	public InputStream getFragmentResource() throws IOException {
		return	this.getClass().getClassLoader().getResourceAsStream("com/dyc/codegen/temp/TempFragment1.txt");
	}
	public InputStream getActivityResource() throws IOException {
		return	this.getClass().getClassLoader().getResourceAsStream("com/dyc/codegen/temp/TempleteActivity1.txt");
//		return	this.getClass().getClassLoader().getResource("com/dyc/test/temp/TempleteActivity1.txt").getFile();
	}

	public InputStream getAdapterResource() throws IOException {
		// 查找指定资源的URL
		return	this.getClass().getClassLoader().getResourceAsStream("com/dyc/codegen/temp/Tempadapter.txt");
//		this.getClass().getClassLoader().getResource("com/dyc/test/temp/Tempadapter.txt").getFile();
	}

	public InputStream getBaseAdapterResource() throws IOException {
		// 查找指定资源的URL
		return	this.getClass().getClassLoader().getResourceAsStream("com/dyc/codegen/temp/MyBaseAdapter.txt");
//		return	this.getClass().getClassLoader().getResource("com/dyc/test/temp/SimpleAdapter.txt").getFile();
	}
	public InputStream getDosCmd() throws IOException {
		// 查找指定资源的URL
		return	this.getClass().getClassLoader().getResourceAsStream("com/dyc/codegen/temp/dos.bat");
//		return	this.getClass().getClassLoader().getResource("com/dyc/test/temp/dos.bat").getFile();
	}
	public InputStream getManifastTag() throws IOException {
		// 查找指定资源的URL
		return	this.getClass().getClassLoader().getResourceAsStream("com/dyc/codegen/temp/activity_plu.txt");
//		return	this.getClass().getClassLoader().getResource("com/dyc/test/temp/activity_plu.txt").getPath();
	}
	
	
}