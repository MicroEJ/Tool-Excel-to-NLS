/*
 * Java
 *
 * Copyright 2015-2017 IS2T. All rights reserved.
 * IS2T PROPRIETARY. Use is subject to license terms.
 */
package com.microej.tool.excel2nls;

import java.util.LinkedList;
import java.util.List;

/**
 * A Language object represent an NLS language. It has a display name, a locale and a list of {@link Message}s.
 */
public class Language {

	private String displayName;
	private String locale;
	private List<Message> messages;

	/**
	 * Instantiate a new language. Both display name and locale equal the empty string.
	 */
	public Language() {
		this("", "");
	}

	/**
	 * Instantiate a new language.
	 *
	 * @param displayName
	 *            the display name
	 * @param locale
	 *            the locale
	 */
	public Language(String displayName, String locale) {
		super();
		this.displayName = displayName;
		this.locale = locale;
		this.messages = new LinkedList<Message>();
	}

	/**
	 * Add a message to this language.
	 *
	 * @param message
	 *            the message
	 */
	public void add(Message message) {
		messages.add(message);
	}

	/**
	 * Get the display name.
	 *
	 * @return the display name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Set the display name.
	 *
	 * @param displayName
	 *            the new display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Get the locale.
	 *
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * Set the locale.
	 *
	 * @param locale
	 *            the new locale
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * Get the messages.
	 *
	 * @return the messages
	 */
	public List<Message> getMessages() {
		return messages;
	}

	@Override
	public String toString() {
		return "Language [displayName=" + displayName + ", locale=" + locale + ", messages=" + messages + "]";
	}

}
