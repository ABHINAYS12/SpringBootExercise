package com.telstra.codechallenge.Excerise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {

	
	@Autowired
	GitHubService gitHubService;

	/*
	 * Find the hottest repositories created in the last week and The endpoint
	 * should accept count parameter and will return the respective records.
	 */

	@RequestMapping(path = "/hottestRepositories/{count}", method = RequestMethod.GET)
	public List<HotestReposotry> getHottestRepositories(@PathVariable(required = true) String count) {
		int numberOfAccounts = 0;
		try {
			numberOfAccounts = Integer.parseInt(count);
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gitHubService.getHottestRepositories(numberOfAccounts);
	}

	/*
	 * Find the oldest user accounts with zero followers and The endpoint will
	 * accept count parameter and will return the respective records.
	 */

	@RequestMapping(path = "/getOldestUser/{count}", method = RequestMethod.GET)
	public List<Items> getOldestUser(@PathVariable(required = true) String count) throws ArithmeticException {
		int numberOfAccounts = 0;
		try {
			numberOfAccounts = Integer.parseInt(count);
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gitHubService.getOldestUser(numberOfAccounts);
	}

}
