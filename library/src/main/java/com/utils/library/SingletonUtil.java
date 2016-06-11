package com.utils.library;

/**
 * Singleton helper class for lazily initialization.
 */
public abstract class SingletonUtil<T> {

    private T instance;

    protected abstract T newInstance();

    public final T getInstance() {
        if (instance == null) {
            synchronized (SingletonUtil.class) {
                if (instance == null) {
                    instance = newInstance();
                }
            }
        }
        return instance;
    }
}
