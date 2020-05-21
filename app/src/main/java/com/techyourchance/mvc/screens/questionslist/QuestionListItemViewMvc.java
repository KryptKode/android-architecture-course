package com.techyourchance.mvc.screens.questionslist;

import com.techyourchance.mvc.questions.Question;
import com.techyourchance.mvc.screens.common.ObservableViewMvc;

/**
 * Created by kryptkode on 5/20/2020.
 */
public interface QuestionListItemViewMvc extends ObservableViewMvc<QuestionListItemViewMvc.Listener> {
    interface Listener {
        void onQuestionClick(Question question);
    }

    void bindQuestion(Question questions);
}
