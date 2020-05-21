package com.techyourchance.mvc.screens.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kryptkode on 5/21/2020.
 */
public abstract class BaseObservableViewMvc<ListenerType> extends BaseViewMvc implements ObservableViewMvc<ListenerType> {

    private final Set<ListenerType> listeners = new HashSet<>();

    protected Set<ListenerType> getListeners() {
        return Collections.unmodifiableSet(listeners);
    }

    @SafeVarargs
    @Override
    public final void registerListener(ListenerType... listeners) {
        this.listeners.addAll(Arrays.asList(listeners));
    }

    @SafeVarargs
    @Override
    public final void unRegisterListener(ListenerType... listeners) {
        this.listeners.removeAll(Arrays.asList(listeners));
    }
}
