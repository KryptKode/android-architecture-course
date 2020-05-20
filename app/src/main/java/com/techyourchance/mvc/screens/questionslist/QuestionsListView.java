package com.techyourchance.mvc.screens.questionslist;

import android.view.View;

import com.techyourchance.mvc.questions.Question;

import java.util.List;

/**
 * Created by kryptkode on 5/20/2020.
 */
interface QuestionsListView {
    interface Listener {
        void onQuestionClick(Question question);
    }

    View getRootView();

    void registerListener(Listener... listeners);

    void unRegisterListener(Listener... listeners);

    void bindQuestions(List<Question> questions);
}
