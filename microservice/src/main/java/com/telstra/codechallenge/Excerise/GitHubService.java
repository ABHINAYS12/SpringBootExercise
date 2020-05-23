package com.telstra.codechallenge.Excerise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubService {

	/*
	 * service method to get the hottestRepositories based on the number of
	 * requested records
	 */
	public List<HotestReposotry> getHottestRepositories(int count) {
		List<HotestReposotry> list = new ArrayList<>();
		List<Item> items = null;
		RestTemplate restTemplate = new RestTemplate();
		String uri = getResourceUrl();
		Github response = restTemplate.getForObject(uri + "?q=created&sort=stars&order=desc", Github.class);

		items = response.getItems().stream().limit(count).collect(Collectors.toList());
		for (Item item : items) {
			HotestReposotry itemObj = new HotestReposotry();
			itemObj.setHtml_url(item.getHtml_url());
			itemObj.setDescription(item.getDescription());
			itemObj.setWatchers_count(item.getWatchers_count());
			itemObj.setLanguage(item.getLanguage());
			item.setName(item.getName());
			list.add(itemObj);
		}
		return list;
	}

	/*
	 * service method to get the OldestUsers reportory based on the number of
	 * requested records
	 */

	public List<Items> getOldestUser(int count) {
		List<Items> itemList = new ArrayList<>();
		List<Item> items = null;
		RestTemplate restTemplate = new RestTemplate();
		String uri = getResourceUrl();
		Github github = restTemplate.getForObject(uri + "?q=followers:0&sort=joined&order=asc", Github.class);

		items = github.getItems().stream().limit(count).collect(Collectors.toList());
		for (Item item : items) {
			Items itemObj = new Items();
			itemObj.setId(item.getId());
			itemObj.setLogin(item.getLogin());
			itemObj.setHtml_url(item.getHtml_url());
			itemList.add(itemObj);
		}

		return itemList;
	}

	private String getResourceUrl() {
		return "https://api.github.com/search/repositories";
	}
}
