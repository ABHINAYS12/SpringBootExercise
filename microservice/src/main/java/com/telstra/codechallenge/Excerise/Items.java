package com.telstra.codechallenge.Excerise;

public class Items {
	private Integer id;
	private String login;
	private String html_url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", login=" + login + ", html_url=" + html_url + "]";
	}

}
