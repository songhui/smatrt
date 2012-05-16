package cn.edu.pku.sei.ra.guineapig.rss.intf;

import java.io.Serializable;

public class ItemInfor implements Serializable {
	public String title;
	public String link;
	public String desc;
	public ItemInfor(String title,String link, String desc){
		this.title=title;
		this.link=link;
		this.desc=desc;
	}
}
