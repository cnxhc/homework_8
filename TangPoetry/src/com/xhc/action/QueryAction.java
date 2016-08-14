package com.xhc.action;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xhc.model.Poetries;
import com.xhc.service.IPoetriesService;
import com.xhc.service.impl.PoetriesService;
import com.xhc.util.Pager;

public class QueryAction extends ActionSupport {
	private IPoetriesService poetriesService;
	private String queryName;
	private String queryTitle;
	private String queryContent;
	private int currentPage=1;
	

	public IPoetriesService getPoetriesService() {
		return poetriesService;
	}

	public void setPoetriesService(IPoetriesService poetriesService) {
		this.poetriesService = poetriesService;
	}

	public String getQueryName() {
		return queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public String getQueryTitle() {
		return queryTitle;
	}

	public void setQueryTitle(String queryTitle) {
		this.queryTitle = queryTitle;
	}

	public String getQueryContent() {
		return queryContent;
	}

	public void setQueryContent(String queryContent) {
		this.queryContent = queryContent;
	}
	

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String queryByName() {
		int totalSize=poetriesService.getTotalByName(queryName);
		Pager page=new Pager(currentPage,totalSize);
		List<Poetries> poetries = poetriesService.queryByName(queryName, currentPage,page.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("poetries", poetries);
		request.put("page", page);
		if (!poetries.isEmpty()) {
			return "byNameSuccess";
		} else {
			return "byNameFail";
		}
	}

	public String queryByTitle() {
		List<Poetries> poetries = poetriesService.queryByTitle(queryTitle);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("poetries", poetries);
		if (!poetries.isEmpty()) {
			return "byTitleSuccess";
		} else {
			return "byTitleFail";
		}
	}

	public String queryByContent() {
		List<Poetries> poetries = poetriesService.queryByContent(queryContent);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("poetries", poetries);
		if (!poetries.isEmpty()) {
			return "byContentSuccess";
		} else {
			return "byContentFail";
		}
	}
}
