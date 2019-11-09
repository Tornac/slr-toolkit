package de.tudresden.slr.questionnaire.model;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import de.tudresden.slr.questionnaire.util.InheritanceDeserializer;

public abstract class Question<E> {

	@SerializedName(InheritanceDeserializer.TYPE_FIELD)
	private String type;

	private String questionText;
	private Map<String, E> answers;

	public Question() {
		type = getClass().getName();
		answers = new HashMap<>();
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public void addAnswer(String documentKey, E answer) {
		if (documentKey == null || answer == null)
			throw new NullPointerException();
		answers.put(documentKey, answer);
	}

	public void removeAnswer(String documentKey) {
		answers.remove(documentKey);
	}

	public E getAnswer(String documentKey) {
		if (documentKey == null)
			return null;
		return answers.get(documentKey);
	}

}