package com.edudigital.cloudy.amp.textbook.service.entity.ao;

import java.io.Serializable;
import java.util.List;

import com.edudigital.cloudy.amp.textbook.service.entity.po.StaEbkPO;

/****
 * 条形图专用类
 * 
 * @author Administrator
 *
 */
public class DataSeriesAO implements Serializable {

	private static final long serialVersionUID = 1L;
	// 书名
	private String name;
	// 数据集
	private List<StaEbkPO> dataPoints;
	// 图形类型
	private String type;
	// 图形图例
	private String showInLegend;

	public List<StaEbkPO> getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(List<StaEbkPO> dataPoints) {
		this.dataPoints = dataPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getShowInLegend() {
		return showInLegend;
	}

	public void setShowInLegend(String showInLegend) {
		this.showInLegend = showInLegend;
	}

}
