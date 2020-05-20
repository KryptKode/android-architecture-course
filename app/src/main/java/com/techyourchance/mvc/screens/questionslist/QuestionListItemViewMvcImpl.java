package com.techyourchance.mvc.screens.questionslist;

import android.support.annotation.IdRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.techyourchance.mvc.R;
import com.techyourchance.mvc.questions.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kryptkode on 5/20/2020.
 */
public class QuestionListItemViewMvcImpl implements QuestionListItemViewMvc {

    private View rootView;
    private Question question;
    private TextView titleTextView;
    private final List<Listener> listeners = new ArrayList<>();

    public QuestionListItemViewMvcImpl(LayoutInflater inflater, ViewGroup parent) {
        rootView = inflater.inflate(R.layout.layout_question_list_item, parent, false);
        titleTextView = findViewById(R.id.txt_title);
        getRootView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Listener listener : listeners) {
                    listener.onQuestionClick(question);
                }
            }
        });
    }

    private <T extends View> T findViewById(@IdRes int viewResId) {
        return getRootView().findViewById(viewResId);
    }

    @Override
    public void bindQuestion(Question question) {
        this.question = question;
        titleTextView.setText(question.getTitle());
    }

    @Override
    public View getRootView() {
        return rootView;
    }

    @Override
    public void registerListener(Listener... listeners) {
        for (Listener listener : listeners) {
            if (!this.listeners.contains(listener)) {
                this.listeners.add(listener);
            }
        }
    }

    @Override
    public void unRegisterListener(Listener... listeners) {
        for (Listener listener : listeners) {
            this.listeners.remove(listener);
        }
    }
}
