package com.techyourchance.mvc.screens.questionslist;

import android.view.View;

import com.techyourchance.mvc.questions.Question;

/**
 * Created by kryptkode on 5/20/2020.
 */
public interface QuestionListItemViewMvc {
    interface Listener {
        void onQuestionClick(Question question);
    }

    void bindQuestion(Question questions);

    View getRootView();

    void registerListener(Listener... listeners);

    void unRegisterListener(Listener... listeners);
}
