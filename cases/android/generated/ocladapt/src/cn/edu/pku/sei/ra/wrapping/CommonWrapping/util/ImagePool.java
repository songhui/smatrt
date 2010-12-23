package cn.edu.pku.sei.ra.wrapping.CommonWrapping.util;

import java.util.ArrayList;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;

public class ImagePool {
	static ArrayList<WrappingEObject> pool=new ArrayList<WrappingEObject>();
	public static void reset(){
		pool=new ArrayList<WrappingEObject>();
	}
	public static void put(WrappingEObject obj){
		pool.add(obj);
	}
	public static WrappingEObject find(Object core){
		for(WrappingEObject we:pool){
			if(we.isForCore(core))
				return we;
		}
		
		return null;
	}
}
