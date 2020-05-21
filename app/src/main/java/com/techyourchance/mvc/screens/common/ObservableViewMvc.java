package com.techyourchance.mvc.screens.common;

/**
 * Created by kryptkode on 5/21/2020.
 */
public interface ObservableViewMvc<ListenerType> extends ViewMvc {
    void registerListener(ListenerType... listeners);

    void unRegisterListener(ListenerType... listeners);
}
