package com.techyourchance.mvc.screens.questionslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.techyourchance.mvc.R;
import com.techyourchance.mvc.questions.Question;
import com.techyourchance.mvc.screens.common.BaseObservableViewMvc;

/**
 * Created by kryptkode on 5/20/2020.
 */
public class QuestionListItemViewMvcImpl extends BaseObservableViewMvc<QuestionListItemViewMvc.Listener> implements QuestionListItemViewMvc {

    private Question question;
    private TextView titleTextView;

    public QuestionListItemViewMvcImpl(LayoutInflater inflater, ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.layout_question_list_item, parent, false));
        titleTextView = findViewById(R.id.txt_title);
        getRootView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Listener listener : getListeners()) {
                    listener.onQuestionClick(question);
                }
            }
        });
    }

    @Override
    public void bindQuestion(Question question) {
        this.question = question;
        titleTextView.setText(question.getTitle());
    }
}
