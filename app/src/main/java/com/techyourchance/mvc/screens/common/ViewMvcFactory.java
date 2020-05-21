package com.techyourchance.mvc.screens.common;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.techyourchance.mvc.screens.questionslist.QuestionListItemViewMvc;
import com.techyourchance.mvc.screens.questionslist.QuestionListItemViewMvcImpl;
import com.techyourchance.mvc.screens.questionslist.QuestionsListView;
import com.techyourchance.mvc.screens.questionslist.QuestionsListViewMvc;

/**
 * Created by kryptkode on 5/21/2020.
 */
public class ViewMvcFactory {
    private final LayoutInflater layoutInflater;

    public ViewMvcFactory(LayoutInflater layoutInflater) {
        this.layoutInflater = layoutInflater;
    }

    public QuestionsListView getQuestionsListView(@Nullable ViewGroup parent) {
        return new QuestionsListViewMvc(layoutInflater, parent, this);
    }

    public QuestionListItemViewMvc getQuestionListItemViewMvc(@Nullable ViewGroup parent) {
        return new QuestionListItemViewMvcImpl(layoutInflater, parent);
    }
}
