package com.bodrul2112.scaffold;

import java.util.Set;
import java.util.TreeSet;

public class ScaffoldSettings {
	
	public static String SCAFFOLDING_TYPE_BARE_BONES = "BAREBONES";
	private Set<String> libraries = new TreeSet<String>();
	private String scaffoldingType = "";
	
	public boolean addLibrary(String library) 
	{
		return libraries.add(library);
	}
	
	public boolean removeLibrary(String library) 
	{
		return libraries.remove(library);
	}
	
	public Set<String> getLibraries() 
	{
		return libraries;
	}
	
	public void setScaffoldingType(String scaffoldingType) 
	{
		this.scaffoldingType = scaffoldingType;
	}
	
	public String getScaffoldingType() {
		return scaffoldingType;
	}
	
	public String getLibrariesAsCommaSeperatedString() {
		
		String str = "";
		for(String lib : libraries){
			str += lib+",";
		}
		if(str.length()>1){
			str = str.substring(0, str.length()-1);
		}
		return str;
	}
	
}
