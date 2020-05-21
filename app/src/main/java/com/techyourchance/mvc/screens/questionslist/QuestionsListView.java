package com.techyourchance.mvc.screens.questionslist;

import com.techyourchance.mvc.questions.Question;
import com.techyourchance.mvc.screens.common.ObservableViewMvc;

import java.util.List;

/**
 * Created by kryptkode on 5/20/2020.
 */
interface QuestionsListView extends ObservableViewMvc<QuestionsListView.Listener> {
    interface Listener {
        void onQuestionClick(Question question);
    }

    void bindQuestions(List<Question> questions);
}
