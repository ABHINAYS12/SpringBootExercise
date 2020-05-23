package com.telstra.codechallenge.Excerise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Main Model class having the below elements*/
public class Github {

	private int total_count;
	private Boolean incomplete_results;
	private List<Item> items = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public int getTotal_count() {
		return total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public Boolean getIncomplete_results() {
		return incomplete_results;
	}

	public void setIncomplete_results(Boolean incomplete_results) {
		this.incomplete_results = incomplete_results;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	@Override
	public String toString() {
		return "Github [total_count=" + total_count + ", incomplete_results=" + incomplete_results + ", items=" + items
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}