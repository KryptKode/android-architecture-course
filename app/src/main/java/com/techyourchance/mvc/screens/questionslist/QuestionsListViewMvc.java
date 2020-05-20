package com.techyourchance.mvc.screens.questionslist;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.techyourchance.mvc.R;
import com.techyourchance.mvc.questions.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kryptkode on 5/20/2020.
 */
public class QuestionsListViewMvc implements QuestionsListAdapter.OnQuestionClickListener, QuestionsListView {

    private ListView mLstQuestions;
    private QuestionsListAdapter mQuestionsListAdapter;
    private View rootView;

    private final List<Listener> listeners = new ArrayList<>();

    public QuestionsListViewMvc(LayoutInflater inflater, @Nullable ViewGroup parent) {
        rootView = inflater.inflate(R.layout.layout_questions_list, parent, false);

        mLstQuestions = findViewById(R.id.lst_questions);
        mQuestionsListAdapter = new QuestionsListAdapter(getContext(), this);
        mLstQuestions.setAdapter(mQuestionsListAdapter);
    }

    private Context getContext() {
        return getRootView().getContext();
    }

    private <T extends View> T findViewById(@IdRes int viewResId) {
        return getRootView().findViewById(viewResId);
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

    @Override
    public void onQuestionClicked(Question question) {
        for (Listener listener : listeners) {
            listener.onQuestionClick(question);
        }
    }

    @Override
    public void bindQuestions(List<Question> questions) {
        mQuestionsListAdapter.clear();
        mQuestionsListAdapter.addAll(questions);
        mQuestionsListAdapter.notifyDataSetChanged();
    }
}
